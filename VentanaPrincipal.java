package Contactos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        txt_Number = new javax.swing.JTextField();
        btn_Crear = new javax.swing.JButton();
        btn_Leer = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("NÚMERO:");

        btn_Crear.setText("CREAR");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        btn_Leer.setText("LEER");
        btn_Leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LeerActionPerformed(evt);
            }
        });

        btn_Actualizar.setText("ACTUALIZAR");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Borrar.setText("BORRAR");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("LIMPIAR");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_Borrar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Limpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Crear)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Leer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Actualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Crear)
                    .addComponent(btn_Leer)
                    .addComponent(btn_Actualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Borrar)
                    .addComponent(btn_Limpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        // TODO add your handling code here:
        try {
 
            // Obtiene el nombre del contacto
            String newName = txt_Name.getText();
 
            // Obtiene el numero del contacto
            long newNumber = Long.parseLong(txt_Number.getText());
 
            String nameNumberString;
            String name;
            long number;
            int index;
            
            //Se crea el objeto File
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {
 
                // Si el archivo no existe, lo crea.
                file.createNewFile();
            }
            
            // Abre el archivo en modo read write.
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Se revisa si el nombre o el numero
            // que se estan intentando agregar ya existen.
            while (raf.getFilePointer() < raf.length()) {

                //Se lee cada linea del archivo y se va separando con el "!"
                nameNumberString = raf.readLine();

                String[] lineSplit = nameNumberString.split("!");
 
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Se comprueba si el nombre O el numero de la linea que se esta leyendo
                // son iguales a los que se estan agregando
                if (name.equals(newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }
            
            //Si no existe aun el contacto se pasa a escribirlo en el archivo.
            if (found == false) {
 
                /* Se reescribe una vble con el formato en el 
                que los contactos se guardan*/
                nameNumberString = newName + "!" + String.valueOf(newNumber);
 
                // Se escribe el contacto en el archivo
                raf.writeBytes(nameNumberString);
 
                // Imprime un salto de linea para el proximo contacto
                raf.writeBytes(System.lineSeparator());
 
                // Muestra el msg de que el contacto ha sido guardado
                JOptionPane.showMessageDialog(this,"Contacto guardado!");
 
                raf.close();
            }
            // Si el contacto ya existe
            else {

                raf.close();
 
                // Muestra msg en pantalla
                JOptionPane.showMessageDialog(this,"El contacto ya existe!");
            }
        }
        catch (IOException ioe) {
 
            System.out.println(ioe);
        }
        catch (NumberFormatException nef) {
 
            System.out.println(nef);
        }
        
    }//GEN-LAST:event_btn_CrearActionPerformed

    private void btn_LeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LeerActionPerformed
        // TODO add your handling code here:
        try {
 
            String nameNumberString;
            String name;
            long number;
            int index;
            String xd = "Nombre - Numero";
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {

                file.createNewFile();
            }
   
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
            index = 0;
 
            // Este ciclo se escarga de mostrar todos los contactos guardados
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Se crea el String de contactos
                xd +=("\n"+name + "-" + number);
                
            }
            //Se muestran todos los contactos
            JOptionPane.showMessageDialog(this,xd);

        }
 
            catch (IOException ioe)
            {
 
                System.out.println(ioe);
            }
            catch (NumberFormatException nef)
            {
 
                System.out.println(nef);
            }
    }//GEN-LAST:event_btn_LeerActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        // TODO add your handling code here:
        try {
 
            String newName = txt_Name.getText();
 
            long newNumber = Long.parseLong(txt_Number.getText());
 
            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {

                file.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Se chequea si el contacto existe
            while (raf.getFilePointer() < raf.length()) {
 
                nameNumberString = raf.readLine();
 
                String[] lineSplit = nameNumberString.split("!");
 
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Se comprueba si el contacto existe
                if (name.equals(newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }
 
            // Si el contacto existe, se actualiza
            if (found) {
 
                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
 
                raf.seek(0);
 
                while (raf.getFilePointer() < raf.length()) {

                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);
 
                    if (name.equals(txt_Name.getText())) {
 
                        nameNumberString = name + "!" + String.valueOf(newNumber);
                    }

                    tmpraf.writeBytes(nameNumberString);

                    tmpraf.writeBytes(System.lineSeparator());
                }
 
                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer() < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();
 
                tmpFile.delete();
 
                JOptionPane.showMessageDialog(this, "Contacto actualizado. ");
            }
 
            // Si el contacto no existe, muestra el mensaje
            else {
 
                raf.close();
 
                // Print the message
                JOptionPane.showMessageDialog(this," El contacto no existe ");
            }
        }
 
        catch (IOException ioe) {
            System.out.println(ioe);
        }
 
        catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        // TODO add your handling code here:
        try {

            String newName = txt_Name.getText();
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {

                file.createNewFile();
            }
 
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            //Chequea si existe el contacto
            while (raf.getFilePointer() < raf.length()) {

                nameNumberString = raf.readLine();

                String[] lineSplit = nameNumberString.split("!");

                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Chequea si el contacto existe
                if (name.equals(newName)) {
                    found = true;
                    break;
                }
            }
 
            // Elimina el contacto, si existe.
            if (found == true) {
 
                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer()
                       < raf.length()) {

                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);

                    if (name.equals(txt_Name.getText())) {

                        continue;
                    }
 
                    tmpraf.writeBytes(nameNumberString);

                    tmpraf.writeBytes(
                        System.lineSeparator());
                }
 

                raf.seek(0);
                tmpraf.seek(0);
 
                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();

                tmpFile.delete();
 
                JOptionPane.showMessageDialog(this," Contacto Borrado");
            }
 
            // The contact to be deleted
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                JOptionPane.showMessageDialog(this," El contacto no existe ");
            }
        }
 
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // TODO add your handling code here:
        txt_Name.setText("");
        txt_Number.setText("");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Leer;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Number;
    // End of variables declaration//GEN-END:variables
}
