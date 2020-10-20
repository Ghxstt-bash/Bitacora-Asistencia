package bitacora;

import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Interfaz_Empleado extends javax.swing.JFrame implements Runnable{
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    private static final String URL="jdbc:mysql://localhost:3306/empleados-bitacora";
    PreparedStatement ps;
    ResultSet rs;
    String hora, minuto, segundos;
    Thread hilo;
    public Interfaz_Empleado() {
        initComponents();
    }
   public static Connection getConection(){
       Connection con = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
           System.out.println("Conexion Exitosa");
       }catch(Exception e){
           System.out.println(e);
       }
       return con;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Hora = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Entrada = new javax.swing.JButton();
        Salida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bitacora - Asistencia Entrada");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        Id.setEditable(false);
        Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre completo:");

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        Fecha.setEditable(false);
        Fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText(" Hora Captura:");

        Hora.setEditable(false);
        Hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Aceptar.setBackground(new java.awt.Color(0, 102, 102));
        Aceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salir.setText("Exit");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Entrada.setBackground(new java.awt.Color(0, 0, 0));
        Entrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Entrada.setForeground(new java.awt.Color(255, 255, 255));
        Entrada.setText("Entrada");

        Salida.setBackground(new java.awt.Color(204, 204, 204));
        Salida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salida.setText("Salida");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Hora))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 34, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrada)
                    .addComponent(Salida))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(Aceptar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
      
    }//GEN-LAST:event_IdActionPerformed

    private void FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaActionPerformed
        GregorianCalendar Calendar = new GregorianCalendar();
        int anio = Calendar.get(Calendar.YEAR);
        int dia = Calendar.get(Calendar.DATE);
        int mes = Calendar.get(Calendar.MONTH);
        System.out.println(dia+"-"+(mes+1)+"-"+anio);
        Fecha.setText(dia+"-"+mes+"-"+anio);
    }//GEN-LAST:event_FechaActionPerformed

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public abstract class Calendar extends Object implements Serializable, Cloneable{

        private void setTime(Date Hora) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        
        String campoId,campoNombre,campoSeleccionar;
        campoId = new String (Id.getText());
        campoNombre = new String (Nombre.getText());
        if ((campoId.equals("") && campoNombre.equals(""))){
            JOptionPane.showMessageDialog(null,"Debes llenar el campo ID o Nombre Completo\n No olvides seleccionar el Tipo de asistencia","Error de Campo",JOptionPane.WARNING_MESSAGE);
        }else{
            Buscar();
            if(JOptionPane.showConfirmDialog(null,"Confirma Asistencia?","Confirmacion",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                AgregarAsistencia();
            }else{
                JOptionPane.showMessageDialog(null,"Accion Cancelada","Confirmacion",JOptionPane.CANCEL_OPTION);
            }
        }
    }//GEN-LAST:event_AceptarActionPerformed
    private void Buscar(){
      Connection con = null;
      getConection();
            try{
             con = getConection();   
             ps = con.prepareStatement("SELECT * FROM lista_empleados WHERE id_empleado = ? OR nom_empleado = ?");
             ps.setString(1, Id.getText());
             ps.setString(2, Nombre.getText());
             rs = ps.executeQuery();
             if(rs.next()){
                 Nombre.setText(rs.getString("nom_empleado"));
                 Fecha();
                 CapturaAsistencia();
             }else{
                 JOptionPane.showMessageDialog(null,"No existe Usuario","Error Busqueda de Empleado",JOptionPane.ERROR_MESSAGE);
             }
            }catch(Exception e){
                System.err.println(e);
            }
    }
    private void CapturaAsistencia(){
        LocalTime HoraActual = LocalTime.now();
        Hora.setText(HoraActual.toString());
    }
    private void AgregarAsistencia(){
        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO `empleados-bitacora`.`entrada` (`nom_empleado`, `fecha`, `captura_hora`) VALUES (?,?,?)");
            ps.setString(1, Nombre.getText());
            ps.setString(2, Fecha.getText());
            ps.setString(3, Hora.getText());
            int res = ps.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null,"Asistencia Completada","Asistencia",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Accion no completada","Asistencia Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }
    private static String FechaActual(){
        Date Fecha = new Date();
        SimpleDateFormat FechaActual = new SimpleDateFormat("dd/MM/YYYY");
        return FechaActual.format(Fecha); 
        }
    private void IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdKeyTyped
        char number = evt.getKeyChar();
        if ((number<'0' || number>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_IdKeyTyped

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter<'a' || caracter>'z')&&(caracter<'A' || caracter>'Z')&&(caracter<' ' || caracter>' ')){
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        NewJFrame Dir = new NewJFrame();
        Dir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed
    private void Fecha(){
        GregorianCalendar Calendar = new GregorianCalendar();
        int anio = Calendar.get(Calendar.YEAR);
        int dia = Calendar.get(Calendar.DATE);
        int mes = Calendar.get(Calendar.MONTH);
        Fecha.setText(dia+"-"+(mes+1)+"-"+anio);
    }
    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
       Interfaz_Salida VentanaSalida = new Interfaz_Salida();
       VentanaSalida.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_SalidaActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Entrada;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTextField Hora;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Salida;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
