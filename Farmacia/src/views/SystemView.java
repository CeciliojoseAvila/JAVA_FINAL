package views;

import controllers.CategoriesController;
import controllers.CustomersController;
import controllers.EmployeesController;
import controllers.ProductsController;
import controllers.PurchasesController;
import controllers.SettingsController;
import controllers.SuppliersController;
import models.Categories;
import models.CategoriesDao;
import models.Customers;
import models.CustomersDao;
import models.Employees;
import models.EmployeesDao;
import static models.EmployeesDao.full_name_user;
import static models.EmployeesDao.rol_user;
import models.Products;
import models.ProductsDao;
import models.Purchases;
import models.PurchasesDao;
import models.Suppliers;
import models.SuppliersDao;

public class SystemView extends javax.swing.JFrame {

    // Empleados
    Employees employee = new Employees();
    EmployeesDao employeesDao = new EmployeesDao();
    // CLIENTES , importamos y colocamos el controlador en public SystemView.
    Customers customer = new Customers();
    CustomersDao customersDao = new CustomersDao();
    // Proveedores
    Suppliers supplier = new Suppliers();
    SuppliersDao supplierDao = new SuppliersDao();

    // Categorias
    Categories category = new Categories();
    CategoriesDao categoryDao = new CategoriesDao();
    // PRODUCTOS
    Products product = new Products();
    ProductsDao productDao = new ProductsDao();
    //Compras
    Purchases purchase = new Purchases();
    PurchasesDao purchaseDao = new PurchasesDao();

    public SystemView() {
        initComponents();
        setSize(1208, 680);
        setResizable(false);
        setLocationRelativeTo(null);
        //setTitle("Panel de administración");
        titleInterface();
        //Controlador del settings
        SettingsController setting = new SettingsController(this);
        this.repaint();

        // Controlador de empleados
        EmployeesController employee_account = new EmployeesController(employee, employeesDao, this);
        //al listar los empleados, se deben llamar acá:
        employee_account.listAllEmployees();

        // Controlador de Clientes
        CustomersController customer_account = new CustomersController(customer, customersDao, this);
        customer_account.listAllCustomers();

        // Controlador de Proveedores
        SuppliersController supplier_account = new SuppliersController(supplier, supplierDao, this);
        supplier_account.listAllSuppliers();

        // Controlador de Categorias
        CategoriesController category_section = new CategoriesController(category, categoryDao, this);
        // 
        category_section.listAllCategories();
        // CONTROLADOR DE PRODUCTOS
        ProductsController product_section = new ProductsController(product, productDao, this);
        product_section.listAllProducts();
        
        // CONTROLADOR DE COMPRAS
        PurchasesController purchase_section = new PurchasesController(purchase, purchaseDao, this);

    }

    public String titleInterface() {
        setTitle("Panel - " + rol_user);
        label_name_employee.setText(full_name_user);
        label_name_rol.setText(rol_user);
        return rol_user.trim();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanelSettings = new javax.swing.JPanel();
        jLabelSettings = new javax.swing.JLabel();
        jPanelPurchases = new javax.swing.JPanel();
        jLabelPurchases = new javax.swing.JLabel();
        jPanelProducts = new javax.swing.JPanel();
        jLabelProducts = new javax.swing.JLabel();
        jPanelEmployees = new javax.swing.JPanel();
        jLabelEmployees = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelSuppliers = new javax.swing.JLabel();
        jPanelCategories = new javax.swing.JPanel();
        jLabelCategories = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelCustomers = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelReports = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_photo = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        label_name_employee = new javax.swing.JLabel();
        label_name_rol = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_product_code = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        txt_product_unit_price = new javax.swing.JTextField();
        txt_product_description = new javax.swing.JTextField();
        cmb_product_category = new javax.swing.JComboBox<>();
        txt_product_id = new javax.swing.JTextField();
        btn_register_product = new javax.swing.JButton();
        btn_update_product = new javax.swing.JButton();
        btn_delete_product = new javax.swing.JButton();
        btn_cancel_product = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_search_product = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        products_table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_purchase_product_code = new javax.swing.JTextField();
        txt_purchase_name = new javax.swing.JTextField();
        txt_purchase_amount = new javax.swing.JTextField();
        cmb_purchase_supplier = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_purchase_price = new javax.swing.JTextField();
        txt_purchase_subtotal = new javax.swing.JTextField();
        txt_purchase_id = new javax.swing.JTextField();
        txt_purchase_total_to_pay = new javax.swing.JTextField();
        btn_add_product_to_buy = new javax.swing.JButton();
        btn_confirm_purchase = new javax.swing.JButton();
        btn_remove_purchase = new javax.swing.JButton();
        btn_new_purchase = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_purchase_product_code2 = new javax.swing.JTextField();
        txt_purchase_name2 = new javax.swing.JTextField();
        txt_purchase_amount2 = new javax.swing.JTextField();
        cmb_product_supplier2 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_purchase_price2 = new javax.swing.JTextField();
        txt_purchase_subtotal2 = new javax.swing.JTextField();
        txt_purchase_id2 = new javax.swing.JTextField();
        txt_purchase_total_to_pay2 = new javax.swing.JTextField();
        btn_add_product_to_buy2 = new javax.swing.JButton();
        btn_confirm_purchase2 = new javax.swing.JButton();
        btn_remove_purchase2 = new javax.swing.JButton();
        btn_new_purchase2 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txt_purchase_product_code3 = new javax.swing.JTextField();
        txt_purchase_name3 = new javax.swing.JTextField();
        txt_purchase_amount3 = new javax.swing.JTextField();
        cmb_product_supplier3 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txt_purchase_price3 = new javax.swing.JTextField();
        txt_purchase_subtotal3 = new javax.swing.JTextField();
        txt_purchase_id3 = new javax.swing.JTextField();
        txt_purchase_total_to_pay3 = new javax.swing.JTextField();
        btn_add_product_to_buy3 = new javax.swing.JButton();
        btn_confirm_purchase3 = new javax.swing.JButton();
        btn_remove_purchase3 = new javax.swing.JButton();
        btn_new_purchase3 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        purchase_table = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txt_customer_id = new javax.swing.JTextField();
        txt_customer_fullname = new javax.swing.JTextField();
        txt_customer_address = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txt_customer_telephone = new javax.swing.JTextField();
        txt_customer_email = new javax.swing.JTextField();
        btn_register_customer = new javax.swing.JButton();
        btn_update_customer = new javax.swing.JButton();
        btn_delete_customer = new javax.swing.JButton();
        btn_cancel_customer = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        txt_search_customer = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txt_employee_id = new javax.swing.JTextField();
        txt_employee_fullname = new javax.swing.JTextField();
        txt_employee_username = new javax.swing.JTextField();
        cmb_rol = new javax.swing.JComboBox();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txt_employee_address = new javax.swing.JTextField();
        txt_employee_email = new javax.swing.JTextField();
        txt_employee_telephone = new javax.swing.JTextField();
        btn_register_employee = new javax.swing.JButton();
        btn_update_employee = new javax.swing.JButton();
        btn_delete_employee = new javax.swing.JButton();
        btn_cancel_employee = new javax.swing.JButton();
        txt_employee_password = new javax.swing.JPasswordField();
        jLabel60 = new javax.swing.JLabel();
        txt_search_employee = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        employees_table = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txt_supplier_id = new javax.swing.JTextField();
        txt_supplier_name = new javax.swing.JTextField();
        txt_supplier_telephone = new javax.swing.JTextField();
        txt_supplier_address = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txt_supplier_email = new javax.swing.JTextField();
        txt_supplier_description = new javax.swing.JTextField();
        cmb_supplier_city = new javax.swing.JComboBox<>();
        btn_register_supplier = new javax.swing.JButton();
        btn_update_supplier = new javax.swing.JButton();
        btn_delete_supplier = new javax.swing.JButton();
        btn_cancel_supplier = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel71 = new javax.swing.JLabel();
        txt_search_supplier = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        suppliers_table = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txt_category_id = new javax.swing.JTextField();
        txt_category_name = new javax.swing.JTextField();
        btn_register_category = new javax.swing.JButton();
        btn_update_category = new javax.swing.JButton();
        btn_delete_category = new javax.swing.JButton();
        btn_cancel_category = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        txt_search_category = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        categories_table = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        table_all_purchases = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txt_id_profile = new javax.swing.JTextField();
        txt_name_profile = new javax.swing.JTextField();
        txt_address_profile = new javax.swing.JTextField();
        txt_phone_profile = new javax.swing.JTextField();
        txt_email_profile = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txt_password_modify_confirm = new javax.swing.JPasswordField();
        txt_password_modify = new javax.swing.JPasswordField();
        btn_modify_data = new javax.swing.JButton();

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 45, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSettings.setBackground(new java.awt.Color(18, 45, 61));
        jPanelSettings.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSettings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/settings.png"))); // NOI18N
        jLabelSettings.setText("   Configuraciones");

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 35));

        jPanelPurchases.setBackground(new java.awt.Color(18, 45, 61));
        jPanelPurchases.setForeground(new java.awt.Color(255, 255, 255));

        jLabelPurchases.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPurchases.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPurchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/purchase.png"))); // NOI18N
        jLabelPurchases.setText("   Compras");

        javax.swing.GroupLayout jPanelPurchasesLayout = new javax.swing.GroupLayout(jPanelPurchases);
        jPanelPurchases.setLayout(jPanelPurchasesLayout);
        jPanelPurchasesLayout.setHorizontalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchasesLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabelPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPurchasesLayout.setVerticalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchasesLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabelPurchases))
        );

        jPanel1.add(jPanelPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 35));

        jPanelProducts.setBackground(new java.awt.Color(18, 45, 61));
        jPanelProducts.setForeground(new java.awt.Color(255, 255, 255));

        jLabelProducts.setBackground(new java.awt.Color(18, 45, 61));
        jLabelProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProducts.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/box.png"))); // NOI18N
        jLabelProducts.setText("    Productos");

        javax.swing.GroupLayout jPanelProductsLayout = new javax.swing.GroupLayout(jPanelProducts);
        jPanelProducts.setLayout(jPanelProductsLayout);
        jPanelProductsLayout.setHorizontalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProductsLayout.setVerticalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductsLayout.createSequentialGroup()
                .addComponent(jLabelProducts)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 35));

        jPanelEmployees.setBackground(new java.awt.Color(18, 45, 61));
        jPanelEmployees.setForeground(new java.awt.Color(255, 255, 255));

        jLabelEmployees.setBackground(new java.awt.Color(18, 45, 61));
        jLabelEmployees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEmployees.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/employee.png"))); // NOI18N
        jLabelEmployees.setText("   Empleados");

        javax.swing.GroupLayout jPanelEmployeesLayout = new javax.swing.GroupLayout(jPanelEmployees);
        jPanelEmployees.setLayout(jPanelEmployeesLayout);
        jPanelEmployeesLayout.setHorizontalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeesLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabelEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelEmployeesLayout.setVerticalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                .addComponent(jLabelEmployees)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 35));

        jPanelSuppliers.setBackground(new java.awt.Color(18, 45, 61));
        jPanelSuppliers.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSuppliers.setBackground(new java.awt.Color(18, 45, 61));
        jLabelSuppliers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/supplier.png"))); // NOI18N
        jLabelSuppliers.setText("   Proveedores");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuppliersLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabelSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addComponent(jLabelSuppliers)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 35));

        jPanelCategories.setBackground(new java.awt.Color(18, 45, 61));
        jPanelCategories.setForeground(new java.awt.Color(255, 255, 255));

        jLabelCategories.setBackground(new java.awt.Color(18, 45, 61));
        jLabelCategories.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCategories.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/categories.png"))); // NOI18N
        jLabelCategories.setText("   Categorias");

        javax.swing.GroupLayout jPanelCategoriesLayout = new javax.swing.GroupLayout(jPanelCategories);
        jPanelCategories.setLayout(jPanelCategoriesLayout);
        jPanelCategoriesLayout.setHorizontalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCategoriesLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabelCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCategoriesLayout.setVerticalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 35));

        jPanelCustomers.setBackground(new java.awt.Color(18, 45, 61));
        jPanelCustomers.setForeground(new java.awt.Color(255, 255, 255));

        jLabelCustomers.setBackground(new java.awt.Color(18, 45, 61));
        jLabelCustomers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/customer.png"))); // NOI18N
        jLabelCustomers.setText("   Clientes");

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomersLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabelCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCustomers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 35));

        jPanelReports.setBackground(new java.awt.Color(18, 45, 61));
        jPanelReports.setForeground(new java.awt.Color(255, 255, 255));

        jLabelReports.setBackground(new java.awt.Color(18, 45, 61));
        jLabelReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/business-report.png"))); // NOI18N
        jLabelReports.setText("   Reportes");

        javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
        jPanelReports.setLayout(jPanelReportsLayout);
        jPanelReportsLayout.setHorizontalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportsLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabelReports, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelReportsLayout.setVerticalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReports, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/farmacia.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jLabel1.setBackground(new java.awt.Color(18, 45, 61));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(18, 45, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FARMACIA VIDA NATURAL");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 80));

        btn_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recursos/Recursos/Iconos/man.png"))); // NOI18N
        btn_photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_photoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, 80));

        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_logout.setText("Salir");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 90, 30));

        label_name_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_name_employee.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(label_name_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 210, 20));

        label_name_rol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label_name_rol.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(label_name_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 170, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jTabbedPane2.setBackground(new java.awt.Color(152, 202, 63));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(152, 202, 63));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("jLabel4");
        jPanel15.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 54, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel15.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 113, -1, -1));

        jLabel6.setText("jLabel6");
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 203, -1, -1));

        jTextField1.setText("jTextField1");
        jPanel15.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 47, -1, -1));

        jTextField2.setText("jTextField2");
        jPanel15.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 110, -1, -1));

        jTextField3.setText("jTextField3");
        jPanel15.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 200, -1, -1));

        jLabel7.setText("jLabel7");
        jPanel15.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1682, 50, -1, -1));

        jLabel8.setText("jLabel8");
        jPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1682, 113, -1, -1));

        jLabel9.setText("jLabel9");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1682, 203, -1, -1));

        jTextField4.setText("jTextField4");
        jPanel15.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1783, 47, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel15.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1783, 110, -1, -1));

        jTextField5.setText("jTextField5");
        jPanel15.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1784, 200, -1, -1));

        jButton1.setText("jButton1");
        jPanel15.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 23, -1, -1));

        jButton2.setText("jButton2");
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 81, -1, -1));

        jButton3.setText("jButton3");
        jPanel15.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 166, -1, -1));

        jButton4.setText("jButton4");
        jPanel15.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 234, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel15.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 364, -1, 115));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel15.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1059, 351, 675, 128));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Codigo: ");
        jPanel15.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 55, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nombre: ");
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 114, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Precio de venta: ");
        jPanel15.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 199, -1, -1));

        txt_product_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_product_codeActionPerformed(evt);
            }
        });
        jPanel15.add(txt_product_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 47, 157, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Descripcion del producto:");
        jPanel15.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 55, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Categoria: ");
        jPanel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 114, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Id: ");
        jPanel15.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));
        jPanel15.add(txt_product_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 106, 157, 30));
        jPanel15.add(txt_product_unit_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 191, 136, 30));
        jPanel15.add(txt_product_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 47, 114, 30));

        jPanel15.add(cmb_product_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 106, 125, 30));

        txt_product_id.setEditable(false);
        txt_product_id.setEnabled(false);
        jPanel15.add(txt_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 125, 30));

        btn_register_product.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_register_product.setForeground(new java.awt.Color(0, 0, 0));
        btn_register_product.setText("Registrar");
        jPanel15.add(btn_register_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 90, 30));

        btn_update_product.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_update_product.setForeground(new java.awt.Color(0, 0, 0));
        btn_update_product.setText("Modificar");
        btn_update_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_productActionPerformed(evt);
            }
        });
        jPanel15.add(btn_update_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 90, 30));

        btn_delete_product.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_delete_product.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete_product.setText("Eliminar");
        btn_delete_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_productActionPerformed(evt);
            }
        });
        jPanel15.add(btn_delete_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 90, 30));

        btn_cancel_product.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_cancel_product.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel_product.setText("Cancelar");
        jPanel15.add(btn_cancel_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 90, 30));

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 250));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Buscar: ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 30));

        txt_search_product.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(txt_search_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 160, 30));

        products_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Codigo", "Nombre", "Descripcion", "Precio de venta", "Cantidad", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(products_table);
        if (products_table.getColumnModel().getColumnCount() > 0) {
            products_table.getColumnModel().getColumn(0).setResizable(false);
            products_table.getColumnModel().getColumn(1).setResizable(false);
            products_table.getColumnModel().getColumn(2).setResizable(false);
            products_table.getColumnModel().getColumn(3).setResizable(false);
            products_table.getColumnModel().getColumn(4).setResizable(false);
            products_table.getColumnModel().getColumn(5).setResizable(false);
            products_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 750, 100));

        jTabbedPane2.addTab("Productos", jPanel4);

        jPanel8.setBackground(new java.awt.Color(152, 202, 63));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Código del producto:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, -1, 28));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Nombre del producto:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 99, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Cantidad: ");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 154, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Proveedor: ");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 192, -1, -1));

        txt_purchase_product_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchase_product_codeActionPerformed(evt);
            }
        });
        jPanel5.add(txt_purchase_product_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 37, 118, 30));

        txt_purchase_name.setEditable(false);
        jPanel5.add(txt_purchase_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 93, 118, 30));
        jPanel5.add(txt_purchase_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 143, 118, 30));

        cmb_purchase_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_purchase_supplierActionPerformed(evt);
            }
        });
        jPanel5.add(cmb_purchase_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 190, 118, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Precio de compra: ");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 43, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Subtotal: ");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 99, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Id: ");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 154, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Total a pagar: ");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 196, -1, -1));
        jPanel5.add(txt_purchase_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 37, 109, 30));

        txt_purchase_subtotal.setEditable(false);
        jPanel5.add(txt_purchase_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 93, 109, 30));

        txt_purchase_id.setEditable(false);
        txt_purchase_id.setEnabled(false);
        jPanel5.add(txt_purchase_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 148, 109, 30));

        txt_purchase_total_to_pay.setEditable(false);
        jPanel5.add(txt_purchase_total_to_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 190, 108, 30));

        btn_add_product_to_buy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_product_to_buy.setText("Agregar");
        btn_add_product_to_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_product_to_buyActionPerformed(evt);
            }
        });
        jPanel5.add(btn_add_product_to_buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 90, 30));

        btn_confirm_purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_confirm_purchase.setText("Comprar");
        btn_confirm_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirm_purchaseActionPerformed(evt);
            }
        });
        jPanel5.add(btn_confirm_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, 30));

        btn_remove_purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remove_purchase.setText("Eliminar");
        jPanel5.add(btn_remove_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 90, 30));

        btn_new_purchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_new_purchase.setText("Nuevo");
        btn_new_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_purchaseActionPerformed(evt);
            }
        });
        jPanel5.add(btn_new_purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 90, 30));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 740, 260));

        jPanel17.setBackground(new java.awt.Color(152, 202, 63));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Código del producto:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Nombre del producto:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Cantidad: ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Proveedor: ");

        txt_purchase_product_code2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchase_product_code2ActionPerformed(evt);
            }
        });

        txt_purchase_name2.setEditable(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Precio de compra: ");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Subtotal: ");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Id: ");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Total a pagar: ");

        txt_purchase_subtotal2.setEditable(false);

        txt_purchase_id2.setEditable(false);
        txt_purchase_id2.setEnabled(false);

        txt_purchase_total_to_pay2.setEditable(false);

        btn_add_product_to_buy2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_product_to_buy2.setText("Agregar");
        btn_add_product_to_buy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_product_to_buy2ActionPerformed(evt);
            }
        });

        btn_confirm_purchase2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_confirm_purchase2.setText("Comprar");
        btn_confirm_purchase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirm_purchase2ActionPerformed(evt);
            }
        });

        btn_remove_purchase2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remove_purchase2.setText("Eliminar");

        btn_new_purchase2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_new_purchase2.setText("Cancelar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_purchase_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_purchase_product_code2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchase_amount2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_product_supplier2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_purchase_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_purchase_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_purchase_subtotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_purchase_total_to_pay2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add_product_to_buy2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_purchase2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_purchase2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_remove_purchase2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txt_purchase_price2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add_product_to_buy2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchase_product_code2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txt_purchase_subtotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_confirm_purchase2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(txt_purchase_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39)
                                    .addComponent(txt_purchase_id2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_purchase_total_to_pay2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40)
                                    .addComponent(cmb_product_supplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_remove_purchase2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_new_purchase2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_purchase_amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel36)
                        .addGap(46, 46, 46))))
        );

        jPanel17.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 260));

        jPanel18.setBackground(new java.awt.Color(152, 202, 63));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Código del producto:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Nombre del producto:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Cantidad: ");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("Proveedor: ");

        txt_purchase_product_code3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_purchase_product_code3ActionPerformed(evt);
            }
        });

        txt_purchase_name3.setEditable(false);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Precio de compra: ");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Subtotal: ");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Id: ");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Total a pagar: ");

        txt_purchase_subtotal3.setEditable(false);

        txt_purchase_id3.setEditable(false);
        txt_purchase_id3.setEnabled(false);

        txt_purchase_total_to_pay3.setEditable(false);

        btn_add_product_to_buy3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add_product_to_buy3.setText("Agregar");
        btn_add_product_to_buy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_product_to_buy3ActionPerformed(evt);
            }
        });

        btn_confirm_purchase3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_confirm_purchase3.setText("Comprar");
        btn_confirm_purchase3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirm_purchase3ActionPerformed(evt);
            }
        });

        btn_remove_purchase3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remove_purchase3.setText("Eliminar");

        btn_new_purchase3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_new_purchase3.setText("Cancelar");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_purchase_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_purchase_product_code3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchase_amount3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_product_supplier3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_purchase_price3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_purchase_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_purchase_subtotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_purchase_total_to_pay3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add_product_to_buy3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_purchase3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_confirm_purchase3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_remove_purchase3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(txt_purchase_price3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add_product_to_buy3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_purchase_product_code3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(txt_purchase_subtotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_confirm_purchase3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(txt_purchase_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel47)
                                    .addComponent(txt_purchase_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_purchase_total_to_pay3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48)
                                    .addComponent(cmb_product_supplier3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_remove_purchase3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_new_purchase3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_purchase_amount3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel44)
                        .addGap(46, 46, 46))))
        );

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 260));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel8.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        purchase_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre del producto ", "Cantidad ", "Precio ", "Subtotal ", "Proveedor "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(purchase_table);

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 730, 130));

        jTabbedPane2.addTab("Compras", jPanel8);

        jPanel9.setBackground(new java.awt.Color(152, 202, 63));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Identificación: ");
        jPanel20.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 50, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Nombre completo: ");
        jPanel20.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 123, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Dirección: ");
        jPanel20.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 193, -1, -1));
        jPanel20.add(txt_customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 44, 133, 30));
        jPanel20.add(txt_customer_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 117, 141, 30));
        jPanel20.add(txt_customer_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 187, 141, 30));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Teléfono: ");
        jPanel20.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 50, -1, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Correo: ");
        jPanel20.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 123, -1, -1));
        jPanel20.add(txt_customer_telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 44, 170, 30));
        jPanel20.add(txt_customer_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 117, 170, 30));

        btn_register_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_customer.setText("Registrar");
        btn_register_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_customerActionPerformed(evt);
            }
        });
        jPanel20.add(btn_register_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 100, 30));

        btn_update_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_customer.setText("Modificar");
        jPanel20.add(btn_update_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 100, 30));

        btn_delete_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_customer.setText("Eliminar");
        jPanel20.add(btn_delete_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 100, 30));

        btn_cancel_customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_customer.setText("Cancelar");
        jPanel20.add(btn_cancel_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 100, 30));

        jPanel9.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 740, 230));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Buscar: ");
        jPanel9.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 70, 30));

        txt_search_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_customerActionPerformed(evt);
            }
        });
        jPanel9.add(txt_search_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 160, 30));

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación ", "Nombre ", "Dirección", "Teléfono ", "Correo "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(customer_table);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 750, 100));

        jTabbedPane2.addTab("Clientes", jPanel9);

        jPanel10.setBackground(new java.awt.Color(152, 202, 63));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("Nombre completo: ");
        jPanel21.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 103, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Identificación: ");
        jPanel21.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 45, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Nombre de Usuario: ");
        jPanel21.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 156, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Rol: ");
        jPanel21.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 229, -1, -1));
        jPanel21.add(txt_employee_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 39, 160, 30));
        jPanel21.add(txt_employee_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 97, 159, 30));
        jPanel21.add(txt_employee_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 150, 157, 30));

        cmb_rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Auxiliar" }));
        jPanel21.add(cmb_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 223, 160, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("Dirección: ");
        jPanel21.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 45, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setText("Teléfono: ");
        jPanel21.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 103, -1, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setText("Correo: ");
        jPanel21.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 156, -1, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setText("Contraseña: ");
        jPanel21.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 229, -1, -1));
        jPanel21.add(txt_employee_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 39, 165, 30));
        jPanel21.add(txt_employee_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 165, 30));
        jPanel21.add(txt_employee_telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 97, 165, 30));

        btn_register_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_employee.setText("Registrar");
        btn_register_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_employeeActionPerformed(evt);
            }
        });
        jPanel21.add(btn_register_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 105, 30));

        btn_update_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_employee.setText("Modificar");
        btn_update_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_employeeActionPerformed(evt);
            }
        });
        jPanel21.add(btn_update_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 105, 30));

        btn_delete_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_employee.setText("Eliminar");
        jPanel21.add(btn_delete_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 105, 30));

        btn_cancel_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_employee.setText("Cancelar");
        jPanel21.add(btn_cancel_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 220, 110, 30));

        txt_employee_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_employee_passwordActionPerformed(evt);
            }
        });
        jPanel21.add(txt_employee_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 222, 140, 30));

        jPanel10.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 750, 290));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Buscar: ");
        jPanel10.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 60, 30));
        jPanel10.add(txt_search_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 160, 30));

        employees_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación ", "Nombre ", "Nombre de Usuario ", "Dirección ", "Teléfono", "Correo ", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(employees_table);

        jPanel10.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 750, 80));

        jTabbedPane2.addTab("Empleados ", jPanel10);

        jPanel11.setBackground(new java.awt.Color(152, 202, 63));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("Id: ");
        jPanel22.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 30, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("Correo: ");
        jPanel22.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setText("Teléfono: ");
        jPanel22.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setText("Dirección: ");
        jPanel22.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, -1, 20));

        txt_supplier_id.setEditable(false);
        txt_supplier_id.setEnabled(false);
        jPanel22.add(txt_supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 130, 30));
        jPanel22.add(txt_supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 42, 160, 30));
        jPanel22.add(txt_supplier_telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 162, 160, 30));
        jPanel22.add(txt_supplier_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 160, 30));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel68.setText("Nombre: ");
        jPanel22.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setText("Descripción: ");
        jPanel22.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setText("Ciudad: ");
        jPanel22.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        txt_supplier_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplier_emailActionPerformed(evt);
            }
        });
        jPanel22.add(txt_supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 212, 160, 30));

        txt_supplier_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supplier_descriptionActionPerformed(evt);
            }
        });
        jPanel22.add(txt_supplier_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 180, 30));

        cmb_supplier_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medellin", "Bogotá", "Barranquilla", "Cali" }));
        jPanel22.add(cmb_supplier_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 102, 170, 30));

        btn_register_supplier.setText("Registrar");
        btn_register_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_supplierActionPerformed(evt);
            }
        });
        jPanel22.add(btn_register_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 90, 30));

        btn_update_supplier.setText("Modificar");
        jPanel22.add(btn_update_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 90, 30));

        btn_delete_supplier.setText("Eliminar");
        jPanel22.add(btn_delete_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 90, 30));

        btn_cancel_supplier.setText("Cancelar");
        jPanel22.add(btn_cancel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 90, 30));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable3);

        jPanel22.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 307, -1, 110));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable5);

        jPanel22.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 307, 720, 150));

        jPanel11.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 250));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Buscar:");
        jPanel11.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 277, 80, 20));
        jPanel11.add(txt_search_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 160, 30));

        suppliers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripción ", "Dirección ", "Teléfono", "Correo", "Ciudad"
            }
        ));
        jScrollPane10.setViewportView(suppliers_table);

        jPanel11.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 750, 100));

        jTabbedPane2.addTab("Proveedores ", jPanel11);

        jPanel12.setBackground(new java.awt.Color(152, 202, 63));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setText("Id: ");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setText("Nombre: ");

        txt_category_id.setEditable(false);
        txt_category_id.setEnabled(false);

        txt_category_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_category_nameActionPerformed(evt);
            }
        });

        btn_register_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_register_category.setText("Registrar");

        btn_update_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update_category.setText("Modificar");

        btn_delete_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete_category.setText("Eliminar");
        btn_delete_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_categoryActionPerformed(evt);
            }
        });

        btn_cancel_category.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel_category.setText("Cancelar");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_category_id, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(txt_category_name, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_cancel_category, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn_update_category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn_delete_category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn_register_category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txt_category_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txt_category_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_delete_category, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, 270));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Buscar:");
        jPanel12.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 50, 30));

        txt_search_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_categoryActionPerformed(evt);
            }
        });
        jPanel12.add(txt_search_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 150, 30));

        categories_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(categories_table);

        jPanel12.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 260, 210));

        jTabbedPane2.addTab("Categorias", jPanel12);

        jPanel13.setBackground(new java.awt.Color(152, 202, 63));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("COMPRAS REALIZADAS");
        jPanel13.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 300, 40));

        table_all_purchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Proveedor", "Total", "Fecha de compra "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(table_all_purchases);

        jPanel13.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 740, 170));

        jTabbedPane2.addTab("Reportes", jPanel13);

        jPanel14.setBackground(new java.awt.Color(152, 202, 63));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Editar perfil"), "Editar perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setText("Identificación: ");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setText("Nombre completo: ");

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setText("Dirección: ");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setText("Teléfono:");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setText("Correo: ");

        txt_id_profile.setEditable(false);

        txt_name_profile.setEditable(false);
        txt_name_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_profileActionPerformed(evt);
            }
        });

        txt_address_profile.setEditable(false);
        txt_address_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_address_profileActionPerformed(evt);
            }
        });

        txt_phone_profile.setEditable(false);

        txt_email_profile.setEditable(false);

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setText("Nueva contraseña: ");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("Confirmar contraseña: ");

        btn_modify_data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_modify_data.setText("Modificar");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_id_profile)
                            .addComponent(txt_email_profile)
                            .addComponent(txt_address_profile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_phone_profile, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_name_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                            .addComponent(jLabel82)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_password_modify_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel24Layout.createSequentialGroup()
                            .addComponent(jLabel81)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_modify_data, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_password_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txt_name_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_modify_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(txt_address_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(txt_phone_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn_modify_data, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(txt_email_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 770, 330));

        jTabbedPane2.addTab("Perfil ", jPanel14);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 790, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_photoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_photoActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btn_logout) {
            dispose();
            LoginView login = new LoginView();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_register_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_supplierActionPerformed

    private void txt_supplier_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplier_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supplier_descriptionActionPerformed

    private void txt_supplier_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supplier_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supplier_emailActionPerformed

    private void txt_address_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_address_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_address_profileActionPerformed

    private void txt_name_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name_profileActionPerformed

    private void txt_search_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_categoryActionPerformed

    private void btn_delete_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_categoryActionPerformed

    private void txt_category_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_category_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_category_nameActionPerformed

    private void txt_employee_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_employee_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_employee_passwordActionPerformed

    private void btn_update_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_update_employeeActionPerformed

    private void btn_register_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_employeeActionPerformed

    private void txt_search_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_customerActionPerformed

    private void btn_register_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_customerActionPerformed

    private void btn_confirm_purchase3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirm_purchase3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirm_purchase3ActionPerformed

    private void btn_add_product_to_buy3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_product_to_buy3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_product_to_buy3ActionPerformed

    private void txt_purchase_product_code3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchase_product_code3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchase_product_code3ActionPerformed

    private void btn_confirm_purchase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirm_purchase2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirm_purchase2ActionPerformed

    private void btn_add_product_to_buy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_product_to_buy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_product_to_buy2ActionPerformed

    private void txt_purchase_product_code2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchase_product_code2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchase_product_code2ActionPerformed

    private void btn_new_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_new_purchaseActionPerformed

    private void btn_confirm_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirm_purchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_confirm_purchaseActionPerformed

    private void btn_add_product_to_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_product_to_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_add_product_to_buyActionPerformed

    private void cmb_purchase_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_purchase_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_purchase_supplierActionPerformed

    private void txt_purchase_product_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_purchase_product_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purchase_product_codeActionPerformed

    private void btn_delete_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_productActionPerformed

    private void btn_update_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_update_productActionPerformed

    private void txt_product_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_product_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_product_codeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_add_product_to_buy;
    private javax.swing.JButton btn_add_product_to_buy2;
    private javax.swing.JButton btn_add_product_to_buy3;
    public javax.swing.JButton btn_cancel_category;
    public javax.swing.JButton btn_cancel_customer;
    public javax.swing.JButton btn_cancel_employee;
    public javax.swing.JButton btn_cancel_product;
    public javax.swing.JButton btn_cancel_supplier;
    public javax.swing.JButton btn_confirm_purchase;
    private javax.swing.JButton btn_confirm_purchase2;
    private javax.swing.JButton btn_confirm_purchase3;
    public javax.swing.JButton btn_delete_category;
    public javax.swing.JButton btn_delete_customer;
    public javax.swing.JButton btn_delete_employee;
    public javax.swing.JButton btn_delete_product;
    public javax.swing.JButton btn_delete_supplier;
    private javax.swing.JButton btn_logout;
    public javax.swing.JButton btn_modify_data;
    public javax.swing.JButton btn_new_purchase;
    private javax.swing.JButton btn_new_purchase2;
    private javax.swing.JButton btn_new_purchase3;
    public javax.swing.JButton btn_photo;
    public javax.swing.JButton btn_register_category;
    public javax.swing.JButton btn_register_customer;
    public javax.swing.JButton btn_register_employee;
    public javax.swing.JButton btn_register_product;
    public javax.swing.JButton btn_register_supplier;
    public javax.swing.JButton btn_remove_purchase;
    private javax.swing.JButton btn_remove_purchase2;
    private javax.swing.JButton btn_remove_purchase3;
    public javax.swing.JButton btn_update_category;
    public javax.swing.JButton btn_update_customer;
    public javax.swing.JButton btn_update_employee;
    public javax.swing.JButton btn_update_product;
    public javax.swing.JButton btn_update_supplier;
    public javax.swing.JTable categories_table;
    public javax.swing.JComboBox<Object> cmb_product_category;
    private javax.swing.JComboBox<String> cmb_product_supplier2;
    private javax.swing.JComboBox<String> cmb_product_supplier3;
    public javax.swing.JComboBox<Object> cmb_purchase_supplier;
    public javax.swing.JComboBox cmb_rol;
    public javax.swing.JComboBox<String> cmb_supplier_city;
    public javax.swing.JTable customer_table;
    public javax.swing.JTable employees_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelCategories;
    public javax.swing.JLabel jLabelCustomers;
    public javax.swing.JLabel jLabelEmployees;
    public javax.swing.JLabel jLabelProducts;
    public javax.swing.JLabel jLabelPurchases;
    public javax.swing.JLabel jLabelReports;
    public javax.swing.JLabel jLabelSettings;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    public javax.swing.JPanel jPanel14;
    public javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel20;
    public javax.swing.JPanel jPanel21;
    public javax.swing.JPanel jPanel22;
    public javax.swing.JPanel jPanel23;
    public javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCategories;
    public javax.swing.JPanel jPanelCustomers;
    public javax.swing.JPanel jPanelEmployees;
    public javax.swing.JPanel jPanelProducts;
    public javax.swing.JPanel jPanelPurchases;
    public javax.swing.JPanel jPanelReports;
    public javax.swing.JPanel jPanelSettings;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JLabel label_name_employee;
    public javax.swing.JLabel label_name_rol;
    public javax.swing.JTable products_table;
    public javax.swing.JTable purchase_table;
    public javax.swing.JTable suppliers_table;
    public javax.swing.JTable table_all_purchases;
    public javax.swing.JTextField txt_address_profile;
    public javax.swing.JTextField txt_category_id;
    public javax.swing.JTextField txt_category_name;
    public javax.swing.JTextField txt_customer_address;
    public javax.swing.JTextField txt_customer_email;
    public javax.swing.JTextField txt_customer_fullname;
    public javax.swing.JTextField txt_customer_id;
    public javax.swing.JTextField txt_customer_telephone;
    public javax.swing.JTextField txt_email_profile;
    public javax.swing.JTextField txt_employee_address;
    public javax.swing.JTextField txt_employee_email;
    public javax.swing.JTextField txt_employee_fullname;
    public javax.swing.JTextField txt_employee_id;
    public javax.swing.JPasswordField txt_employee_password;
    public javax.swing.JTextField txt_employee_telephone;
    public javax.swing.JTextField txt_employee_username;
    public javax.swing.JTextField txt_id_profile;
    public javax.swing.JTextField txt_name_profile;
    public javax.swing.JPasswordField txt_password_modify;
    public javax.swing.JPasswordField txt_password_modify_confirm;
    public javax.swing.JTextField txt_phone_profile;
    public javax.swing.JTextField txt_product_code;
    public javax.swing.JTextField txt_product_description;
    public javax.swing.JTextField txt_product_id;
    public javax.swing.JTextField txt_product_name;
    public javax.swing.JTextField txt_product_unit_price;
    public javax.swing.JTextField txt_purchase_amount;
    private javax.swing.JTextField txt_purchase_amount2;
    private javax.swing.JTextField txt_purchase_amount3;
    public javax.swing.JTextField txt_purchase_id;
    private javax.swing.JTextField txt_purchase_id2;
    private javax.swing.JTextField txt_purchase_id3;
    public javax.swing.JTextField txt_purchase_name;
    private javax.swing.JTextField txt_purchase_name2;
    private javax.swing.JTextField txt_purchase_name3;
    public javax.swing.JTextField txt_purchase_price;
    private javax.swing.JTextField txt_purchase_price2;
    private javax.swing.JTextField txt_purchase_price3;
    public javax.swing.JTextField txt_purchase_product_code;
    private javax.swing.JTextField txt_purchase_product_code2;
    private javax.swing.JTextField txt_purchase_product_code3;
    public javax.swing.JTextField txt_purchase_subtotal;
    private javax.swing.JTextField txt_purchase_subtotal2;
    private javax.swing.JTextField txt_purchase_subtotal3;
    public javax.swing.JTextField txt_purchase_total_to_pay;
    private javax.swing.JTextField txt_purchase_total_to_pay2;
    private javax.swing.JTextField txt_purchase_total_to_pay3;
    public javax.swing.JTextField txt_search_category;
    public javax.swing.JTextField txt_search_customer;
    public javax.swing.JTextField txt_search_employee;
    public javax.swing.JTextField txt_search_product;
    public javax.swing.JTextField txt_search_supplier;
    public javax.swing.JTextField txt_supplier_address;
    public javax.swing.JTextField txt_supplier_description;
    public javax.swing.JTextField txt_supplier_email;
    public javax.swing.JTextField txt_supplier_id;
    public javax.swing.JTextField txt_supplier_name;
    public javax.swing.JTextField txt_supplier_telephone;
    // End of variables declaration//GEN-END:variables

    public class txt_employee_password {

        public static Object getPassword() {

            return null;

        }

        public txt_employee_password() {
        }
    }
}
