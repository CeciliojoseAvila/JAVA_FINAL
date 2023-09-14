package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Employees;
import models.EmployeesDao;
import views.LoginView;
import views.SystemView;

public class LoginController implements ActionListener {

    private Employees employee;
    private EmployeesDao employeesDao;
    private LoginView loginView;

    public LoginController(Employees employee, EmployeesDao employeesDao, LoginView loginView) {
        this.employee = employee;
        this.employeesDao = employeesDao;
        this.loginView = loginView;
        this.loginView.btn_enter.addActionListener(this);//BOTON INGRESAR
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //LOGICA DE INGRESO 
        // OBTENER LOS DATOS DE LA VISTA
        String user = loginView.txt_username.getText().trim();
        String pass = String.valueOf(loginView.txt_password.getPassword());

        if (e.getSource() == loginView.btn_enter) {
            //Validar que los campos no estén vacios
            if (!user.equals(" ") || !pass.equals(" ")) {
                //pasar los parametros al método login
                employee = employeesDao.loginQuery(user, pass);

                //Verificar la existencia del usuario
                if (employee.getUsername() != null) {
                    if (employee.getRol().equals("Administrador")) {
                        SystemView admin = new SystemView();
                        admin.setVisible(true);
                    } else {
                        SystemView aux = new SystemView();
                        aux.setVisible(true);
                    }
                    this.loginView.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Los campos están vacios");
            }
        }
    }

}
//debemos instanciar el controlador en Views (LoginView) / public LoginView()