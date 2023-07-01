package task4;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileExplorerApp extends JFrame {
    private JList<File> fileList;
    private DefaultListModel<File> listModel;
    private JTextField pathField;

    public FileExplorerApp() {
        setTitle("File Explorer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        setLocationRelativeTo(null);

        // Create the list model and JList
        listModel = new DefaultListModel<>();
        fileList = new JList<>(listModel);
        fileList.setCellRenderer(new FileListRenderer());
        fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fileList.addMouseListener(new FileMouseListener());

        // Add a scroll pane to the list
        JScrollPane scrollPane = new JScrollPane(fileList);
        add(scrollPane, BorderLayout.CENTER);

        // Create a panel for the path field and buttons
        JPanel panel = new JPanel(new BorderLayout());
        pathField = new JTextField();
        pathField.setEditable(false);
        panel.add(pathField, BorderLayout.CENTER);

        // Create the buttons
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new BackButtonListener());
        JButton openButton = new JButton("Open");
        openButton.addActionListener(new OpenButtonListener());
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());
        JButton copyButton = new JButton("Copy");
        copyButton.addActionListener(new CopyButtonListener());
        JButton moveButton = new JButton("Move");
        moveButton.addActionListener(new MoveButtonListener());
        JButton newFolderButton = new JButton("New Folder");
        newFolderButton.addActionListener(new NewFolderButtonListener());

        // Add the buttons to the panel
        panel.add(backButton, BorderLayout.WEST);
        panel.add(openButton, BorderLayout.EAST);
        panel.add(deleteButton, BorderLayout.SOUTH);
        panel.add(copyButton, BorderLayout.NORTH);
        panel.add(moveButton, BorderLayout.SOUTH);
        panel.add(newFolderButton, BorderLayout.NORTH);

        // Add the panel to the frame
        add(panel, BorderLayout.NORTH);

        // Set the root directory to display
        String rootDirectory = System.getProperty("user.home");
        displayDirectory(rootDirectory);

        pack();
        setVisible(true);
    }

    private void displayDirectory(String directoryPath) {
        // Clear the list model
        listModel.clear();

        // Set the current directory path
        pathField.setText(directoryPath);

        // Get all the files and directories in the current directory
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            // Add the files and directories to the list model
            for (File file : files) {
                listModel.addElement(file);
            }
        }
    }

    private class BackButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String currentPath = pathField.getText();
            File currentDirectory = new File(currentPath);
            File parentDirectory = currentDirectory.getParentFile();
            if (parentDirectory != null) {
                displayDirectory(parentDirectory.getAbsolutePath());
            }
        }
    }

    private class OpenButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File selectedFile = fileList.getSelectedValue();
            if (selectedFile != null) {
                if (selectedFile.isDirectory()) {
                    // If the selected item is a directory, display its contents
                    displayDirectory(selectedFile.getAbsolutePath());
                } else {
                    // If the selected item is a file, open it using the default application
                    try {
                        Desktop.getDesktop().open(selectedFile);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File selectedFile = fileList.getSelectedValue();
            if (selectedFile != null) {
                int response = JOptionPane.showConfirmDialog(FileExplorerApp.this,
                        "Are you sure you want to delete the selected file/folder?", "Confirm Deletion",
                        JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    try {
                        if (selectedFile.isDirectory()) {
                            deleteDirectory(selectedFile);
                        } else {
                            Files.delete(selectedFile.toPath());
                        }
                        displayDirectory(pathField.getText());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(FileExplorerApp.this,
                                "An error occurred while deleting the file/folder.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        private void deleteDirectory(File directory) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteDirectory(file);
                    } else {
                        file.delete();
                    }
                }
            }
            directory.delete();
        }
    }

    private class CopyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File selectedFile = fileList.getSelectedValue();
            if (selectedFile != null) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select Destination Folder");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int result = fileChooser.showDialog(FileExplorerApp.this, "Select");
                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        File destinationDirectory = fileChooser.getSelectedFile();
                        File destinationFile = new File(destinationDirectory, selectedFile.getName());
                        if (selectedFile.isDirectory()) {
                            copyDirectory(selectedFile, destinationFile);
                        } else {
                            Files.copy(selectedFile.toPath(), destinationFile.toPath(),
                                    StandardCopyOption.REPLACE_EXISTING);
                        }
                        displayDirectory(pathField.getText());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(FileExplorerApp.this,
                                "An error occurred while copying the file/folder.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        private void copyDirectory(File sourceDirectory, File destinationDirectory) throws Exception {
            if (!destinationDirectory.exists()) {
                destinationDirectory.mkdirs();
            }
            File[] files = sourceDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    File destination = new File(destinationDirectory, file.getName());
                    if (file.isDirectory()) {
                        copyDirectory(file, destination);
                    } else {
                        Files.copy(file.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
        }
    }

    private class MoveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File selectedFile = fileList.getSelectedValue();
            if (selectedFile != null) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select Destination Folder");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int result = fileChooser.showDialog(FileExplorerApp.this, "Select");
                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        File destinationDirectory = fileChooser.getSelectedFile();
                        File destinationFile = new File(destinationDirectory, selectedFile.getName());
                        if (selectedFile.isDirectory()) {
                            moveDirectory(selectedFile, destinationFile);
                        } else {
                            Files.move(selectedFile.toPath(), destinationFile.toPath(),
                                    StandardCopyOption.REPLACE_EXISTING);
                        }
                        displayDirectory(pathField.getText());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(FileExplorerApp.this,
                                "An error occurred while moving the file/folder.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        private void moveDirectory(File sourceDirectory, File destinationDirectory) throws Exception {
            if (!destinationDirectory.exists()) {
                destinationDirectory.mkdirs();
            }
            File[] files = sourceDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    File destination = new File(destinationDirectory, file.getName());
                    if (file.isDirectory()) {
                        moveDirectory(file, destination);
                    } else {
                        Files.move(file.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
            sourceDirectory.delete();
        }
    }

    private class NewFolderButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String folderName = JOptionPane.showInputDialog(FileExplorerApp.this, "Enter the folder name:",
                    "Create New Folder", JOptionPane.PLAIN_MESSAGE);
            if (folderName != null && !folderName.isEmpty()) {
                String currentPath = pathField.getText();
                File newFolder = new File(currentPath, folderName);
                if (newFolder.mkdir()) {
                    displayDirectory(currentPath);
                } else {
                    JOptionPane.showMessageDialog(FileExplorerApp.this, "Failed to create the folder.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class FileMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                File selectedFile = fileList.getSelectedValue();
                if (selectedFile != null && selectedFile.isDirectory()) {
                    // If double-clicked on a directory, display its contents
                    displayDirectory(selectedFile.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FileExplorerApp();
            }
        });
    }
}

class FileListRenderer extends DefaultListCellRenderer {
    private FileSystemView fileSystemView;

    public FileListRenderer() {
        fileSystemView = FileSystemView.getFileSystemView();
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                                                  boolean cellHasFocus) {
        if (value instanceof File) {
            File file = (File) value;
            setText(fileSystemView.getSystemDisplayName(file));
            setIcon(fileSystemView.getSystemIcon(file));
        } else {
            setText(value.toString());
            setIcon(null);
        }

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);

        return this;
    }
}