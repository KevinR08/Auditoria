/*      */ package proyectoestructurasdedatos;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.KeyAdapter;
/*      */ import java.awt.event.KeyEvent;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.File;
/*      */ import java.io.FileReader;
/*      */ import java.io.FileWriter;
/*      */ import java.io.PrintWriter;
/*      */ import java.util.StringTokenizer;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JComboBox;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JScrollPane;
/*      */ import javax.swing.JTextArea;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.LayoutStyle;
/*      */ import javax.swing.UIManager;
/*      */ 
/*      */ public class Interfaz extends JFrame {
/*   25 */   Empleado empleado = new Empleado();
/*   26 */   NodoEmpleadoLista nuevoNodo = new NodoEmpleadoLista();
/*   27 */   ListaDEnlazada lista = new ListaDEnlazada();
/*   28 */   TablaHashEnlazadaEmpleados tabla = new TablaHashEnlazadaEmpleados();
/*   29 */   ArregloEmpleados Sucursal1 = new ArregloEmpleados(1);
/*   30 */   ArregloEmpleados Sucursal2 = new ArregloEmpleados(2);
/*   31 */   ArregloEmpleados Sucursal3 = new ArregloEmpleados(3);
/*   32 */   ArregloEmpleados Sucursal4 = new ArregloEmpleados(4); String sucursal; private JButton btnInsertarEmpleado; private JButton btnMostrarEmpleados; private JButton btnMostrarTablaHashPrevia; private JButton btnNuevo; private JButton btnRotar; private JComboBox<String> cbxSucursales;
/*      */   private JComboBox<String> cmbCargo;
/*      */   private JLabel jLabel1;
/*      */   private JLabel jLabel2;
/*      */   private JLabel jLabel3;
/*      */   private JLabel jLabel4;
/*      */   private JLabel jLabel5;
/*      */   private JLabel jLabel6;
/*      */   private JLabel jLabel7;
/*      */   private JLabel jLabel8;
/*      */   private JMenu jMenu1;
/*      */   private JMenu jMenu2;
/*      */   private JMenuBar jMenuBar1;
/*      */   private JMenuItem jMenuItem1;
/*      */   private JMenuItem jMenuItem3;
/*      */   
/*      */   public Interfaz() {
/*   49 */     initComponents();
/*      */     
/*   51 */     File archivo = null;
/*   52 */     FileReader fr = null;
/*   53 */     BufferedReader br = null;
/*      */     try {
/*   55 */       archivo = new File("registroEmpleados2.txt");
/*   56 */       fr = new FileReader(archivo);
/*   57 */       br = new BufferedReader(fr);
/*      */       String linea;
/*   59 */       while ((linea = br.readLine()) != null) {
/*   60 */         StringTokenizer tokens = new StringTokenizer(linea, ",");
/*   61 */         String dato = tokens.nextToken();
/*   62 */         Empleado nuevoEmpleado = new Empleado();
/*   63 */         nuevoEmpleado.setCodigo(dato);
/*   64 */         dato = tokens.nextToken();
/*   65 */         nuevoEmpleado.setNombres(dato);
/*   66 */         dato = tokens.nextToken();
/*   67 */         nuevoEmpleado.setApellidos(dato);
/*   68 */         dato = tokens.nextToken();
/*   69 */         nuevoEmpleado.setCargo(dato);
/*   70 */         dato = tokens.nextToken();
/*   71 */         nuevoEmpleado.setUltimaSucursal(dato);
/*   72 */         dato = tokens.nextToken();
/*   73 */         nuevoEmpleado.setDireccion(dato);
/*   74 */         dato = tokens.nextToken();
/*   75 */         nuevoEmpleado.setCorreo(dato);
/*   76 */         dato = tokens.nextToken();
/*   77 */         nuevoEmpleado.setNumTelf(dato);
/*      */         
/*   79 */         this.lista.insertarOrdenado(nuevoEmpleado);
/*      */         
/*   81 */         if (nuevoEmpleado.getCargo().equals("Vendedor"))
/*      */         {
/*   83 */           this.tabla.inicializar(nuevoEmpleado.getCodigo(), nuevoEmpleado.getUltimaSucursal());
/*      */         }
/*      */       } 
/*   86 */     } catch (Exception e) {
/*   87 */       e.printStackTrace();
/*      */     } finally {
/*      */       try {
/*   90 */         if (null != fr) {
/*   91 */           fr.close();
/*      */         }
/*   93 */       } catch (Exception e2) {
/*   94 */         e2.printStackTrace();
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  100 */     File archivo1 = null;
/*  101 */     FileReader fr1 = null;
/*  102 */     BufferedReader br1 = null;
/*      */     try {
/*  104 */       archivo1 = new File("codigosEmpleadosSucursal1.txt");
/*  105 */       fr1 = new FileReader(archivo1);
/*  106 */       br1 = new BufferedReader(fr1);
/*      */       String codigo1;
/*  108 */       while ((codigo1 = br1.readLine()) != null) {
/*  109 */         this.Sucursal1.insertarCodigo(codigo1);
/*      */       }
/*  111 */     } catch (Exception e1) {
/*  112 */       e1.printStackTrace();
/*      */     } finally {
/*      */       try {
/*  115 */         if (null != fr1) {
/*  116 */           fr1.close();
/*      */         }
/*  118 */       } catch (Exception e) {
/*  119 */         e.printStackTrace();
/*      */       } 
/*      */     } 
/*      */     
/*  123 */     File archivo2 = null;
/*  124 */     FileReader fr2 = null;
/*  125 */     BufferedReader br2 = null;
/*      */     try {
/*  127 */       archivo2 = new File("codigosEmpleadosSucursal2.txt");
/*  128 */       fr2 = new FileReader(archivo2);
/*  129 */       br2 = new BufferedReader(fr2);
/*      */       String codigo2;
/*  131 */       while ((codigo2 = br2.readLine()) != null) {
/*  132 */         this.Sucursal2.insertarCodigo(codigo2);
/*      */       }
/*  134 */     } catch (Exception e2) {
/*  135 */       e2.printStackTrace();
/*      */     } finally {
/*      */       try {
/*  138 */         if (null != fr2) {
/*  139 */           fr2.close();
/*      */         }
/*  141 */       } catch (Exception e) {
/*  142 */         e.printStackTrace();
/*      */       } 
/*      */     } 
/*      */     
/*  146 */     File archivo3 = null;
/*  147 */     FileReader fr3 = null;
/*  148 */     BufferedReader br3 = null;
/*      */     try {
/*  150 */       archivo3 = new File("codigosEmpleadosSucursal3.txt");
/*  151 */       fr3 = new FileReader(archivo3);
/*  152 */       br3 = new BufferedReader(fr3);
/*      */       String codigo3;
/*  154 */       while ((codigo3 = br3.readLine()) != null) {
/*  155 */         this.Sucursal3.insertarCodigo(codigo3);
/*      */       }
/*  157 */     } catch (Exception e3) {
/*  158 */       e3.printStackTrace();
/*      */     } finally {
/*      */       try {
/*  161 */         if (null != fr3) {
/*  162 */           fr3.close();
/*      */         }
/*  164 */       } catch (Exception e) {
/*  165 */         e.printStackTrace();
/*      */       } 
/*      */     } 
/*      */     
/*  169 */     File archivo4 = null;
/*  170 */     FileReader fr4 = null;
/*  171 */     BufferedReader br4 = null;
/*      */     try {
/*  173 */       archivo4 = new File("codigosEmpleadosSucursal4.txt");
/*  174 */       fr4 = new FileReader(archivo4);
/*  175 */       br4 = new BufferedReader(fr4);
/*      */       String codigo4;
/*  177 */       while ((codigo4 = br4.readLine()) != null) {
/*  178 */         this.Sucursal4.insertarCodigo(codigo4);
/*      */       }
/*  180 */     } catch (Exception e4) {
/*  181 */       e4.printStackTrace();
/*      */     } finally {
/*      */       try {
/*  184 */         if (null != fr4) {
/*  185 */           fr4.close();
/*      */         }
/*  187 */       } catch (Exception e) {
/*  188 */         e.printStackTrace();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   private JPanel jPanel1; private JPanel jPanel2;
/*      */   private JPanel jPanel3;
/*      */   private JScrollPane jScrollPane1;
/*      */   private JScrollPane jScrollPane2;
/*      */   private JScrollPane jScrollPane3;
/*      */   private JScrollPane jScrollPane4;
/*      */   private JScrollPane jScrollPane5;
/*      */   private JTabbedPane jTabbedPane1;
/*      */   private JLabel lblApellidos;
/*      */   
/*      */   private void initComponents() {
/*  203 */     this.jTabbedPane1 = new JTabbedPane();
/*  204 */     this.jPanel1 = new JPanel();
/*  205 */     this.lblNombres = new JLabel();
/*  206 */     this.lblApellidos = new JLabel();
/*  207 */     this.txtNombres = new JTextField();
/*  208 */     this.jLabel1 = new JLabel();
/*  209 */     this.jLabel2 = new JLabel();
/*  210 */     this.jLabel3 = new JLabel();
/*  211 */     this.txtApellidos = new JTextField();
/*  212 */     this.txtDireccion = new JTextField();
/*  213 */     this.txtCorreo = new JTextField();
/*  214 */     this.txtNumTelf = new JTextField();
/*  215 */     this.btnInsertarEmpleado = new JButton();
/*  216 */     this.jScrollPane1 = new JScrollPane();
/*  217 */     this.txaEmpleado = new JTextArea();
/*  218 */     this.cmbCargo = new JComboBox<>();
/*  219 */     this.jLabel6 = new JLabel();
/*  220 */     this.btnNuevo = new JButton();
/*  221 */     this.jLabel7 = new JLabel();
/*  222 */     this.jScrollPane5 = new JScrollPane();
/*  223 */     this.txaNuevoEmpleado = new JTextArea();
/*  224 */     this.jLabel8 = new JLabel();
/*  225 */     this.jPanel2 = new JPanel();
/*  226 */     this.jLabel4 = new JLabel();
/*  227 */     this.jScrollPane2 = new JScrollPane();
/*  228 */     this.txaAntes = new JTextArea();
/*  229 */     this.jLabel5 = new JLabel();
/*  230 */     this.jScrollPane3 = new JScrollPane();
/*  231 */     this.txaDespués = new JTextArea();
/*  232 */     this.btnRotar = new JButton();
/*  233 */     this.btnMostrarTablaHashPrevia = new JButton();
/*  234 */     this.jPanel3 = new JPanel();
/*  235 */     this.cbxSucursales = new JComboBox<>();
/*  236 */     this.btnMostrarEmpleados = new JButton();
/*  237 */     this.jScrollPane4 = new JScrollPane();
/*  238 */     this.txaMostrarEmpleados = new JTextArea();
/*  239 */     this.jMenuBar1 = new JMenuBar();
/*  240 */     this.jMenu2 = new JMenu();
/*  241 */     this.jMenu1 = new JMenu();
/*  242 */     this.jMenuItem3 = new JMenuItem();
/*  243 */     this.jMenuItem1 = new JMenuItem();
/*      */     
/*  245 */     setDefaultCloseOperation(3);
/*      */     
/*  247 */     this.lblNombres.setText("Nombre");
/*      */     
/*  249 */     this.lblApellidos.setText("Apellido");
/*      */     
/*  251 */     this.txtNombres.addKeyListener(new KeyAdapter() {
/*      */           public void keyPressed(KeyEvent evt) {
/*  253 */             Interfaz.this.txtNombresKeyPressed(evt);
/*      */           }
/*      */         });
/*      */     
/*  257 */     this.jLabel1.setText("Correo electrónico");
/*      */     
/*  259 */     this.jLabel2.setText("Dirección");
/*      */     
/*  261 */     this.jLabel3.setText("Número de teléfeno");
/*      */     
/*  263 */     this.txtApellidos.addKeyListener(new KeyAdapter() {
/*      */           public void keyPressed(KeyEvent evt) {
/*  265 */             Interfaz.this.txtApellidosKeyPressed(evt);
/*      */           }
/*      */         });
/*      */     
/*  269 */     this.txtDireccion.addKeyListener(new KeyAdapter() {
/*      */           public void keyPressed(KeyEvent evt) {
/*  271 */             Interfaz.this.txtDireccionKeyPressed(evt);
/*      */           }
/*      */         });
/*      */     
/*  275 */     this.txtCorreo.addKeyListener(new KeyAdapter() {
/*      */           public void keyPressed(KeyEvent evt) {
/*  277 */             Interfaz.this.txtCorreoKeyPressed(evt);
/*      */           }
/*      */         });
/*      */     
/*  281 */     this.txtNumTelf.addKeyListener(new KeyAdapter() {
/*      */           public void keyPressed(KeyEvent evt) {
/*  283 */             Interfaz.this.txtNumTelfKeyPressed(evt);
/*      */           }
/*      */         });
/*      */     
/*  287 */     this.btnInsertarEmpleado.setText("Registrar");
/*  288 */     this.btnInsertarEmpleado.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  290 */             Interfaz.this.btnInsertarEmpleadoActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  294 */     this.txaEmpleado.setColumns(20);
/*  295 */     this.txaEmpleado.setRows(5);
/*  296 */     this.jScrollPane1.setViewportView(this.txaEmpleado);
/*      */     
/*  298 */     this.cmbCargo.setModel(new DefaultComboBoxModel<>(new String[] { "Vendedor", "Contador", "Encargado de Bodega" }));
/*      */     
/*  300 */     this.jLabel6.setText("Cargo");
/*      */     
/*  302 */     this.btnNuevo.setText("Nuevo");
/*  303 */     this.btnNuevo.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  305 */             Interfaz.this.btnNuevoActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  309 */     this.jLabel7.setText("Lista Completa de Empleados");
/*      */     
/*  311 */     this.txaNuevoEmpleado.setColumns(20);
/*  312 */     this.txaNuevoEmpleado.setRows(5);
/*  313 */     this.jScrollPane5.setViewportView(this.txaNuevoEmpleado);
/*      */     
/*  315 */     this.jLabel8.setText("Nuevo Empleado:");
/*      */     
/*  317 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  318 */     this.jPanel1.setLayout(jPanel1Layout);
/*  319 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  320 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  321 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  322 */           .addContainerGap()
/*  323 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  324 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  325 */               .addComponent(this.lblNombres)
/*  326 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  327 */               .addComponent(this.txtNombres, -2, 200, -2))
/*  328 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  329 */               .addComponent(this.jLabel2)
/*  330 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  331 */               .addComponent(this.txtDireccion))
/*  332 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  333 */               .addComponent(this.jLabel1)
/*  334 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  335 */               .addComponent(this.txtCorreo))
/*  336 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  337 */               .addComponent(this.jLabel3)
/*  338 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  339 */               .addComponent(this.txtNumTelf))
/*  340 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  341 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  342 */                 .addComponent(this.lblApellidos)
/*  343 */                 .addComponent(this.jLabel6))
/*  344 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  345 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  346 */                 .addComponent(this.cmbCargo, 0, -1, 32767)
/*  347 */                 .addComponent(this.txtApellidos)))
/*  348 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  349 */               .addGap(41, 41, 41)
/*  350 */               .addComponent(this.btnNuevo)
/*  351 */               .addGap(18, 18, 18)
/*  352 */               .addComponent(this.btnInsertarEmpleado))
/*  353 */             .addComponent(this.jScrollPane5, -2, 247, -2)
/*  354 */             .addComponent(this.jLabel8))
/*  355 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  356 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  357 */               .addGap(101, 101, 101)
/*  358 */               .addComponent(this.jLabel7)
/*  359 */               .addContainerGap(77, 32767))
/*  360 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  361 */               .addGap(18, 18, 18)
/*  362 */               .addComponent(this.jScrollPane1, -1, 289, 32767)
/*  363 */               .addContainerGap()))));
/*      */     
/*  365 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  366 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  367 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  368 */           .addContainerGap()
/*  369 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  370 */             .addComponent(this.lblNombres)
/*  371 */             .addComponent(this.txtNombres, -2, -1, -2)
/*  372 */             .addComponent(this.jLabel7))
/*  373 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  374 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  375 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  376 */               .addComponent(this.jScrollPane1)
/*  377 */               .addContainerGap())
/*  378 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  379 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  380 */                 .addComponent(this.lblApellidos)
/*  381 */                 .addComponent(this.txtApellidos, -2, -1, -2))
/*  382 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  383 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  384 */                 .addComponent(this.cmbCargo, -2, -1, -2)
/*  385 */                 .addComponent(this.jLabel6))
/*  386 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  387 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  388 */                 .addComponent(this.jLabel2)
/*  389 */                 .addComponent(this.txtDireccion, -2, -1, -2))
/*  390 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  391 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  392 */                 .addComponent(this.jLabel1)
/*  393 */                 .addComponent(this.txtCorreo, -2, -1, -2))
/*  394 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  395 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  396 */                 .addComponent(this.jLabel3)
/*  397 */                 .addComponent(this.txtNumTelf, -2, -1, -2))
/*  398 */               .addGap(10, 10, 10)
/*  399 */               .addComponent(this.jLabel8)
/*  400 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  401 */               .addComponent(this.jScrollPane5, -1, 143, 32767)
/*  402 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  403 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  404 */                 .addComponent(this.btnNuevo)
/*  405 */                 .addComponent(this.btnInsertarEmpleado))
/*  406 */               .addGap(11, 11, 11)))));
/*      */ 
/*      */     
/*  409 */     this.jTabbedPane1.addTab("Registro Empleado", this.jPanel1);
/*      */     
/*  411 */     this.jLabel4.setText("Lista previa a la rotación");
/*      */     
/*  413 */     this.txaAntes.setColumns(20);
/*  414 */     this.txaAntes.setRows(5);
/*  415 */     this.jScrollPane2.setViewportView(this.txaAntes);
/*      */     
/*  417 */     this.jLabel5.setText("Lista después de la rotación");
/*      */     
/*  419 */     this.txaDespués.setColumns(20);
/*  420 */     this.txaDespués.setRows(5);
/*  421 */     this.jScrollPane3.setViewportView(this.txaDespués);
/*      */     
/*  423 */     this.btnRotar.setText("Rotar");
/*  424 */     this.btnRotar.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  426 */             Interfaz.this.btnRotarActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  430 */     this.btnMostrarTablaHashPrevia.setText("Mostrar Lista Previa");
/*  431 */     this.btnMostrarTablaHashPrevia.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  433 */             Interfaz.this.btnMostrarTablaHashPreviaActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  437 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  438 */     this.jPanel2.setLayout(jPanel2Layout);
/*  439 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/*  440 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  441 */         .addGroup(jPanel2Layout.createSequentialGroup()
/*  442 */           .addContainerGap()
/*  443 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  444 */             .addComponent(this.jScrollPane2)
/*  445 */             .addComponent(this.jScrollPane3)
/*  446 */             .addGroup(jPanel2Layout.createSequentialGroup()
/*  447 */               .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  448 */                 .addComponent(this.jLabel4)
/*  449 */                 .addComponent(this.jLabel5))
/*  450 */               .addGap(0, 0, 32767)))
/*  451 */           .addContainerGap())
/*  452 */         .addGroup(jPanel2Layout.createSequentialGroup()
/*  453 */           .addGap(158, 158, 158)
/*  454 */           .addComponent(this.btnMostrarTablaHashPrevia)
/*  455 */           .addGap(36, 36, 36)
/*  456 */           .addComponent(this.btnRotar)
/*  457 */           .addContainerGap(194, 32767)));
/*      */     
/*  459 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/*  460 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  461 */         .addGroup(jPanel2Layout.createSequentialGroup()
/*  462 */           .addContainerGap()
/*  463 */           .addComponent(this.jLabel4)
/*  464 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  465 */           .addComponent(this.jScrollPane2, -2, 135, -2)
/*  466 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  467 */           .addComponent(this.jLabel5)
/*  468 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  469 */           .addComponent(this.jScrollPane3, -2, 135, -2)
/*  470 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  471 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  472 */             .addComponent(this.btnRotar)
/*  473 */             .addComponent(this.btnMostrarTablaHashPrevia))
/*  474 */           .addContainerGap(13, 32767)));
/*      */ 
/*      */     
/*  477 */     this.jTabbedPane1.addTab("Rotar Empleados", this.jPanel2);
/*      */     
/*  479 */     this.cbxSucursales.setModel(new DefaultComboBoxModel<>(new String[] { "Sucursal 1", "Sucursal 2", "Sucursal 3", "Sucursal 4" }));
/*  480 */     this.cbxSucursales.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  482 */             Interfaz.this.cbxSucursalesActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  486 */     this.btnMostrarEmpleados.setText("Mostrar Empleados");
/*  487 */     this.btnMostrarEmpleados.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  489 */             Interfaz.this.btnMostrarEmpleadosActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  493 */     this.txaMostrarEmpleados.setColumns(20);
/*  494 */     this.txaMostrarEmpleados.setRows(5);
/*  495 */     this.jScrollPane4.setViewportView(this.txaMostrarEmpleados);
/*      */     
/*  497 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/*  498 */     this.jPanel3.setLayout(jPanel3Layout);
/*  499 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/*  500 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  501 */         .addGroup(jPanel3Layout.createSequentialGroup()
/*  502 */           .addContainerGap()
/*  503 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  504 */             .addComponent(this.jScrollPane4)
/*  505 */             .addGroup(jPanel3Layout.createSequentialGroup()
/*  506 */               .addComponent(this.cbxSucursales, -2, -1, -2)
/*  507 */               .addGap(18, 18, 18)
/*  508 */               .addComponent(this.btnMostrarEmpleados)
/*  509 */               .addGap(0, 338, 32767)))
/*  510 */           .addContainerGap()));
/*      */     
/*  512 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/*  513 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  514 */         .addGroup(jPanel3Layout.createSequentialGroup()
/*  515 */           .addContainerGap()
/*  516 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  517 */             .addComponent(this.cbxSucursales, -2, -1, -2)
/*  518 */             .addComponent(this.btnMostrarEmpleados))
/*  519 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  520 */           .addComponent(this.jScrollPane4, -1, 323, 32767)
/*  521 */           .addContainerGap()));
/*      */ 
/*      */     
/*  524 */     this.jTabbedPane1.addTab("Consultar", this.jPanel3);
/*      */     
/*  526 */     this.jMenu2.setText("Edit");
/*  527 */     this.jMenuBar1.add(this.jMenu2);
/*      */     
/*  529 */     this.jMenu1.setText("File");
/*      */     
/*  531 */     this.jMenuItem3.setText("Salir");
/*  532 */     this.jMenuItem3.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  534 */             Interfaz.this.jMenuItem3ActionPerformed(evt);
/*      */           }
/*      */         });
/*  537 */     this.jMenu1.add(this.jMenuItem3);
/*      */     
/*  539 */     this.jMenuItem1.setText("jMenuItem1");
/*  540 */     this.jMenu1.add(this.jMenuItem1);
/*      */     
/*  542 */     this.jMenuBar1.add(this.jMenu1);
/*      */     
/*  544 */     setJMenuBar(this.jMenuBar1);
/*      */     
/*  546 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  547 */     getContentPane().setLayout(layout);
/*  548 */     layout.setHorizontalGroup(layout
/*  549 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  550 */         .addGroup(layout.createSequentialGroup()
/*  551 */           .addContainerGap()
/*  552 */           .addComponent(this.jTabbedPane1)
/*  553 */           .addContainerGap()));
/*      */     
/*  555 */     layout.setVerticalGroup(layout
/*  556 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  557 */         .addGroup(layout.createSequentialGroup()
/*  558 */           .addContainerGap()
/*  559 */           .addComponent(this.jTabbedPane1, -2, 402, -2)
/*  560 */           .addContainerGap(-1, 32767)));
/*      */ 
/*      */     
/*  563 */     pack();
/*      */   }
/*      */   private JLabel lblNombres; private JTextArea txaAntes; private JTextArea txaDespués; private JTextArea txaEmpleado; private JTextArea txaMostrarEmpleados; private JTextArea txaNuevoEmpleado; private JTextField txtApellidos; private JTextField txtCorreo; private JTextField txtDireccion; private JTextField txtNombres; private JTextField txtNumTelf;
/*      */   
/*      */   private void jMenuItem3ActionPerformed(ActionEvent evt) {
/*  568 */     System.exit(0);
/*      */   }
/*      */   
/*      */   private void btnInsertarEmpleadoActionPerformed(ActionEvent evt) {
/*  572 */     if (this.txtNombres.getText().equals("") || this.txtApellidos
/*  573 */       .getText().equals("") || this.txtDireccion
/*  574 */       .getText().equals("") || this.txtCorreo
/*  575 */       .getText().equals("") || this.txtNumTelf
/*  576 */       .getText().equals("")) {
/*      */       
/*  578 */       JOptionPane.showMessageDialog(null, "Para registrar un empleado debe llenar TODOS los campos");
/*  579 */       this.txtNombres.requestFocus();
/*      */     } else {
/*      */       NodoEmpleadoLista nodoEmpleado;
/*      */       
/*  583 */       String cargo = String.valueOf(this.cmbCargo.getSelectedItem());
/*  584 */       String codigo = "";
/*  585 */       switch (cargo) {
/*      */         case "Vendedor":
/*  587 */           codigo = codigo + "VD";
/*  588 */           codigo = codigo + "-";
/*  589 */           codigo = codigo + this.empleado.generarDigitos();
/*  590 */           nodoEmpleado = new NodoEmpleadoLista();
/*  591 */           while (nodoEmpleado.adelante != null && codigo.equals(this.empleado.getCodigo())) {
/*  592 */             codigo = "VD";
/*  593 */             codigo = codigo + "-";
/*  594 */             codigo = codigo + this.empleado.generarDigitos();
/*  595 */             nodoEmpleado = nodoEmpleado.adelante;
/*      */           } 
/*      */           break;
/*      */         case "Contador":
/*  599 */           codigo = codigo + "CT";
/*  600 */           codigo = codigo + "-";
/*  601 */           codigo = codigo + this.empleado.generarDigitos();
/*  602 */           while (this.nuevoNodo.adelante != null && codigo.equals(this.empleado.getCodigo())) {
/*  603 */             codigo = "CT";
/*  604 */             codigo = codigo + "-";
/*  605 */             codigo = codigo + this.empleado.generarDigitos();
/*  606 */             this.nuevoNodo = this.nuevoNodo.adelante;
/*      */           } 
/*      */           break;
/*      */         case "Encargado de Bodega":
/*  610 */           codigo = codigo + "EB";
/*  611 */           codigo = codigo + "-";
/*  612 */           codigo = codigo + this.empleado.generarDigitos();
/*  613 */           while (this.nuevoNodo.adelante != null && codigo.equals(this.empleado.getCodigo())) {
/*  614 */             codigo = "EB";
/*  615 */             codigo = codigo + "-";
/*  616 */             codigo = codigo + this.empleado.generarDigitos();
/*  617 */             this.nuevoNodo = this.nuevoNodo.adelante;
/*      */           } 
/*      */           break;
/*      */       } 
/*  621 */       String nombres = this.txtNombres.getText();
/*  622 */       String apellidos = this.txtApellidos.getText();
/*  623 */       String direccion = this.txtDireccion.getText();
/*  624 */       String correo = this.txtCorreo.getText();
/*  625 */       String telefono = this.txtNumTelf.getText();
/*      */       
/*  627 */       int numCodigo = Integer.parseInt(codigo.substring(3, 7));
/*  628 */       int numC = numCodigo % 4;
/*  629 */       String ultimaSucursal = String.valueOf(numC);
/*      */       
/*  631 */       Empleado nuevoEmpleado = new Empleado(codigo, nombres, apellidos, cargo, ultimaSucursal, direccion, correo, telefono);
/*  632 */       this.lista.insertarOrdenado(nuevoEmpleado);
/*  633 */       this.tabla.inicializar(codigo, ultimaSucursal);
/*  634 */       this.txaNuevoEmpleado.setText(nuevoEmpleado.toString());
/*  635 */       this.txaEmpleado.setText(this.lista.mostrar());
/*      */       
/*  637 */       this.lista.actualizaFichero();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void btnRotarActionPerformed(ActionEvent evt) {
/*  645 */     TablaHashEnlazadaEmpleados tabla2 = new TablaHashEnlazadaEmpleados();
/*      */     
/*  647 */     Empleado empleadoAux = new Empleado();
/*  648 */     NodoEmpleadoLista actual = this.lista.getCabecera();
/*  649 */     int k = 0;
/*  650 */     while (k == 0) {
/*  651 */       if (actual.getAdelante() != null) {
/*  652 */         empleadoAux = actual.getInfo();
/*  653 */         if (empleadoAux.getCargo().equals("Vendedor")) {
/*  654 */           String auxS = empleadoAux.getUltimaSucursal();
/*  655 */           int auxN = Integer.parseInt(auxS);
/*  656 */           auxN++;
/*  657 */           auxN %= 4;
/*      */           
/*  659 */           tabla2.insertarEmpleadoTabla(empleadoAux.getCodigo(), String.valueOf(auxN));
/*      */           
/*  661 */           empleadoAux.setUltimaSucursal(String.valueOf(auxN));
/*  662 */           actual.setInfo(empleadoAux);
/*      */         } 
/*  664 */         actual = actual.getAdelante(); continue;
/*      */       } 
/*  666 */       empleadoAux = actual.getInfo();
/*  667 */       if (empleadoAux.getCargo().equals("Vendedor")) {
/*  668 */         String auxS = empleadoAux.getUltimaSucursal();
/*  669 */         int auxN = Integer.parseInt(auxS);
/*  670 */         auxN++;
/*  671 */         auxN %= 4;
/*      */         
/*  673 */         tabla2.insertarEmpleadoTabla(empleadoAux.getCodigo(), String.valueOf(auxN));
/*      */         
/*  675 */         empleadoAux.setUltimaSucursal(String.valueOf(auxN));
/*  676 */         actual.setInfo(empleadoAux);
/*      */       } 
/*  678 */       actual = actual.getAdelante();
/*  679 */       k = 1;
/*      */     } 
/*      */ 
/*      */     
/*  683 */     this.tabla = tabla2;
/*  684 */     this.txaDespués.setText(this.tabla.mostrarEstructura());
/*  685 */     this.btnMostrarTablaHashPrevia.setEnabled(false);
/*      */ 
/*      */     
/*  688 */     for (int i = 0; i < 4; i++) {
/*  689 */       File archivo1; FileWriter fw1; PrintWriter pw1; File archivo2; FileWriter fw2; PrintWriter pw2; File archivo3; FileWriter fw3; PrintWriter pw3; File archivo4; FileWriter fw4; PrintWriter pw4; switch (i) {
/*      */         case 0:
/*  691 */           archivo1 = null;
/*  692 */           fw1 = null;
/*  693 */           pw1 = null;
/*      */           try {
/*  695 */             archivo1 = new File("codigosEmpleadosSucursal1.txt");
/*  696 */             fw1 = new FileWriter(archivo1);
/*  697 */             pw1 = new PrintWriter(fw1);
/*  698 */             NodoEmpleado nodoActual = tabla2.getNodoEmpleado(0);
/*      */             
/*  700 */             int j = 0;
/*  701 */             while (j == 0) {
/*  702 */               if (nodoActual.enlace != null) {
/*  703 */                 String str = nodoActual.getCodigo();
/*  704 */                 pw1.println(str);
/*  705 */                 nodoActual = nodoActual.enlace; continue;
/*      */               } 
/*  707 */               String nuevoCodigo = nodoActual.getCodigo();
/*  708 */               pw1.println(nuevoCodigo);
/*  709 */               nodoActual = nodoActual.enlace;
/*  710 */               j = 1;
/*      */             }
/*      */           
/*  713 */           } catch (Exception e) {
/*  714 */             e.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  717 */               if (fw1 != null) {
/*  718 */                 fw1.close();
/*      */               }
/*  720 */             } catch (Exception e) {
/*  721 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*      */           break;
/*      */         case 1:
/*  726 */           archivo2 = null;
/*  727 */           fw2 = null;
/*  728 */           pw2 = null;
/*      */           try {
/*  730 */             archivo2 = new File("codigosEmpleadosSucursal2.txt");
/*  731 */             fw2 = new FileWriter(archivo2);
/*  732 */             pw2 = new PrintWriter(fw2);
/*  733 */             NodoEmpleado nodoActual = tabla2.getNodoEmpleado(1);
/*      */             
/*  735 */             int j = 0;
/*  736 */             while (j == 0) {
/*  737 */               if (nodoActual.enlace != null) {
/*  738 */                 String str = nodoActual.getCodigo();
/*  739 */                 pw2.println(str);
/*  740 */                 nodoActual = nodoActual.enlace; continue;
/*      */               } 
/*  742 */               String nuevoCodigo = nodoActual.getCodigo();
/*  743 */               pw2.println(nuevoCodigo);
/*  744 */               nodoActual = nodoActual.enlace;
/*  745 */               j = 1;
/*      */             }
/*      */           
/*  748 */           } catch (Exception e) {
/*  749 */             e.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  752 */               if (fw2 != null) {
/*  753 */                 fw2.close();
/*      */               }
/*  755 */             } catch (Exception e) {
/*  756 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*      */           break;
/*      */         case 2:
/*  761 */           archivo3 = null;
/*  762 */           fw3 = null;
/*  763 */           pw3 = null;
/*      */           try {
/*  765 */             archivo3 = new File("codigosEmpleadosSucursal3.txt");
/*  766 */             fw3 = new FileWriter(archivo3);
/*  767 */             pw3 = new PrintWriter(fw3);
/*  768 */             NodoEmpleado nodoActual = tabla2.getNodoEmpleado(2);
/*      */             
/*  770 */             int j = 0;
/*  771 */             while (j == 0) {
/*  772 */               if (nodoActual.enlace != null) {
/*  773 */                 String str = nodoActual.getCodigo();
/*  774 */                 pw3.println(str);
/*  775 */                 nodoActual = nodoActual.enlace; continue;
/*      */               } 
/*  777 */               String nuevoCodigo = nodoActual.getCodigo();
/*  778 */               pw3.println(nuevoCodigo);
/*  779 */               nodoActual = nodoActual.enlace;
/*  780 */               j = 1;
/*      */             }
/*      */           
/*  783 */           } catch (Exception e) {
/*  784 */             e.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  787 */               if (fw3 != null) {
/*  788 */                 fw3.close();
/*      */               }
/*  790 */             } catch (Exception e) {
/*  791 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*      */           break;
/*      */         case 3:
/*  796 */           archivo4 = null;
/*  797 */           fw4 = null;
/*  798 */           pw4 = null;
/*      */           try {
/*  800 */             archivo4 = new File("codigosEmpleadosSucursal4.txt");
/*  801 */             fw4 = new FileWriter(archivo4);
/*  802 */             pw4 = new PrintWriter(fw4);
/*  803 */             NodoEmpleado nodoActual = tabla2.getNodoEmpleado(3);
/*      */             
/*  805 */             int j = 0;
/*  806 */             while (j == 0) {
/*  807 */               if (nodoActual.enlace != null) {
/*  808 */                 String str = nodoActual.getCodigo();
/*  809 */                 pw4.println(str);
/*  810 */                 nodoActual = nodoActual.enlace; continue;
/*      */               } 
/*  812 */               String nuevoCodigo = nodoActual.getCodigo();
/*  813 */               pw4.println(nuevoCodigo);
/*  814 */               nodoActual = nodoActual.enlace;
/*  815 */               j = 1;
/*      */             }
/*      */           
/*  818 */           } catch (Exception e) {
/*  819 */             e.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  822 */               if (fw4 != null) {
/*  823 */                 fw4.close();
/*      */               }
/*  825 */             } catch (Exception e) {
/*  826 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*      */           break;
/*      */         default:
/*  831 */           JOptionPane.showInputDialog((Component)null, "Algo salió mal xD");
/*      */           break;
/*      */       } 
/*      */     } 
/*  835 */     this.Sucursal1.vaciarArreglo();
/*  836 */     this.Sucursal2.vaciarArreglo();
/*  837 */     this.Sucursal3.vaciarArreglo();
/*  838 */     this.Sucursal4.vaciarArreglo();
/*      */ 
/*      */     
/*  841 */     this.lista.actualizaFichero();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void cbxSucursalesActionPerformed(ActionEvent evt) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void btnMostrarEmpleadosActionPerformed(ActionEvent evt) {
/*  853 */     this.sucursal = String.valueOf(this.cbxSucursales.getSelectedItem());
/*  854 */     this.txaMostrarEmpleados.setText("");
/*  855 */     String texto = "";
/*  856 */     switch (this.sucursal) {
/*      */       case "Sucursal 1":
/*  858 */         if (!this.Sucursal1.estaVacio()) {
/*  859 */           texto = texto + this.Sucursal1.mostrarEstructura(this.lista);
/*  860 */           this.txaMostrarEmpleados.setText(texto);
/*      */         } else {
/*  862 */           File archivo1 = null;
/*  863 */           FileReader fr1 = null;
/*  864 */           BufferedReader br1 = null;
/*      */           try {
/*  866 */             archivo1 = new File("codigosEmpleadosSucursal1.txt");
/*  867 */             fr1 = new FileReader(archivo1);
/*  868 */             br1 = new BufferedReader(fr1);
/*      */             String codigo1;
/*  870 */             while ((codigo1 = br1.readLine()) != null) {
/*  871 */               this.Sucursal1.insertarCodigo(codigo1);
/*      */             }
/*  873 */           } catch (Exception e1) {
/*  874 */             e1.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  877 */               if (null != fr1) {
/*  878 */                 fr1.close();
/*      */               }
/*  880 */             } catch (Exception e) {
/*  881 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*  884 */           this.txaMostrarEmpleados.setText(this.Sucursal1.mostrarEstructura(this.lista));
/*      */         } 
/*      */         return;
/*      */       case "Sucursal 2":
/*  888 */         if (!this.Sucursal2.estaVacio()) {
/*  889 */           this.txaMostrarEmpleados.setText(this.Sucursal2.mostrarEstructura(this.lista));
/*      */         } else {
/*  891 */           File archivo2 = null;
/*  892 */           FileReader fr2 = null;
/*  893 */           BufferedReader br2 = null;
/*      */           try {
/*  895 */             archivo2 = new File("codigosEmpleadosSucursal2.txt");
/*  896 */             fr2 = new FileReader(archivo2);
/*  897 */             br2 = new BufferedReader(fr2);
/*      */             String codigo2;
/*  899 */             while ((codigo2 = br2.readLine()) != null) {
/*  900 */               this.Sucursal2.insertarCodigo(codigo2);
/*      */             }
/*  902 */           } catch (Exception e2) {
/*  903 */             e2.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  906 */               if (null != fr2) {
/*  907 */                 fr2.close();
/*      */               }
/*  909 */             } catch (Exception e) {
/*  910 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*  913 */           this.txaMostrarEmpleados.setText(this.Sucursal2.mostrarEstructura(this.lista));
/*      */         } 
/*      */         return;
/*      */       case "Sucursal 3":
/*  917 */         if (!this.Sucursal3.estaVacio()) {
/*  918 */           this.txaMostrarEmpleados.setText(this.Sucursal3.mostrarEstructura(this.lista));
/*      */         } else {
/*  920 */           File archivo3 = null;
/*  921 */           FileReader fr3 = null;
/*  922 */           BufferedReader br3 = null;
/*      */           try {
/*  924 */             archivo3 = new File("codigosEmpleadosSucursal3.txt");
/*  925 */             fr3 = new FileReader(archivo3);
/*  926 */             br3 = new BufferedReader(fr3);
/*      */             String codigo3;
/*  928 */             while ((codigo3 = br3.readLine()) != null) {
/*  929 */               this.Sucursal3.insertarCodigo(codigo3);
/*      */             }
/*  931 */           } catch (Exception e3) {
/*  932 */             e3.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  935 */               if (null != fr3) {
/*  936 */                 fr3.close();
/*      */               }
/*  938 */             } catch (Exception e) {
/*  939 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*  942 */           this.txaMostrarEmpleados.setText(this.Sucursal3.mostrarEstructura(this.lista));
/*      */         } 
/*      */         return;
/*      */       case "Sucursal 4":
/*  946 */         if (!this.Sucursal4.estaVacio()) {
/*  947 */           this.txaMostrarEmpleados.setText(this.Sucursal4.mostrarEstructura(this.lista));
/*      */         } else {
/*  949 */           File archivo4 = null;
/*  950 */           FileReader fr4 = null;
/*  951 */           BufferedReader br4 = null;
/*      */           try {
/*  953 */             archivo4 = new File("codigosEmpleadosSucursal4.txt");
/*  954 */             fr4 = new FileReader(archivo4);
/*  955 */             br4 = new BufferedReader(fr4);
/*      */             String codigo4;
/*  957 */             while ((codigo4 = br4.readLine()) != null) {
/*  958 */               this.Sucursal4.insertarCodigo(codigo4);
/*      */             }
/*  960 */           } catch (Exception e4) {
/*  961 */             e4.printStackTrace();
/*      */           } finally {
/*      */             try {
/*  964 */               if (null != fr4) {
/*  965 */                 fr4.close();
/*      */               }
/*  967 */             } catch (Exception e) {
/*  968 */               e.printStackTrace();
/*      */             } 
/*      */           } 
/*  971 */           this.txaMostrarEmpleados.setText(this.Sucursal4.mostrarEstructura(this.lista));
/*      */         } 
/*      */         return;
/*      */     } 
/*  975 */     JOptionPane.showMessageDialog(null, "Algo salió mal");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void txtCorreoKeyPressed(KeyEvent evt) {
/*  984 */     if (evt.getKeyCode() == 10) {
/*  985 */       Empleado emp = new Empleado();
/*  986 */       String correo = this.txtCorreo.getText();
/*  987 */       if (!emp.esCorreoValido(correo)) {
/*  988 */         JOptionPane.showMessageDialog(null, "Correo inválido, vuelva a ingresarlo");
/*  989 */         this.txtCorreo.setText("");
/*  990 */         this.txtCorreo.requestFocus();
/*      */       } else {
/*  992 */         this.txtNumTelf.requestFocus();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void txtNumTelfKeyPressed(KeyEvent evt) {
/*  999 */     if (evt.getKeyCode() == 10) {
/* 1000 */       Empleado emp = new Empleado();
/* 1001 */       String numTelf = this.txtNumTelf.getText();
/* 1002 */       if (!emp.esTelefonoValido(numTelf)) {
/* 1003 */         JOptionPane.showMessageDialog(null, "Número de teléfono inválido, vuelva a ingresarlo");
/* 1004 */         this.txtNumTelf.setText("");
/* 1005 */         this.txtNumTelf.requestFocus();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void txtNombresKeyPressed(KeyEvent evt) {
/* 1013 */     if (evt.getKeyCode() == 10) {
/* 1014 */       Empleado emp = new Empleado();
/* 1015 */       String nombre = this.txtNombres.getText();
/* 1016 */       if (!emp.esNombreValido(nombre)) {
/* 1017 */         JOptionPane.showMessageDialog(null, "Su nombre no puede contener números ni caracteres especiales");
/* 1018 */         this.txtNombres.setText("");
/* 1019 */         this.txtNombres.requestFocus();
/*      */       } else {
/* 1021 */         this.txtApellidos.requestFocus();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void txtApellidosKeyPressed(KeyEvent evt) {
/* 1028 */     if (evt.getKeyCode() == 10) {
/* 1029 */       Empleado emp = new Empleado();
/* 1030 */       String apellido = this.txtApellidos.getText();
/* 1031 */       if (!emp.esApellidoValido(apellido)) {
/* 1032 */         JOptionPane.showMessageDialog(null, "Su apellido no puede contener números ni caracteres especiales");
/* 1033 */         this.txtApellidos.setText("");
/* 1034 */         this.txtApellidos.requestFocus();
/*      */       } else {
/* 1036 */         this.cmbCargo.requestFocus();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void txtDireccionKeyPressed(KeyEvent evt) {
/* 1043 */     if (evt.getKeyCode() == 10) {
/* 1044 */       Empleado emp = new Empleado();
/* 1045 */       String direccion = this.txtDireccion.getText();
/* 1046 */       if (!emp.esApellidoValido(direccion)) {
/* 1047 */         JOptionPane.showMessageDialog(null, "Su direccion no puede contener números ni caracteres especiales");
/* 1048 */         this.txtDireccion.setText("");
/* 1049 */         this.txtDireccion.requestFocus();
/*      */       } else {
/* 1051 */         this.txtCorreo.requestFocus();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void btnNuevoActionPerformed(ActionEvent evt) {
/* 1057 */     this.txtNombres.setText("");
/* 1058 */     this.txtApellidos.setText("");
/* 1059 */     this.txtDireccion.setText("");
/* 1060 */     this.txtNumTelf.setText("");
/* 1061 */     this.txtCorreo.setText("");
/* 1062 */     this.txaEmpleado.setText("");
/* 1063 */     this.txaNuevoEmpleado.setText("");
/* 1064 */     this.txtNombres.requestFocus();
/*      */   }
/*      */ 
/*      */   
/*      */   private void btnMostrarTablaHashPreviaActionPerformed(ActionEvent evt) {
/* 1069 */     this.txaAntes.setText(this.tabla.mostrarEstructura());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void main(String[] args) {
/*      */     try {
/* 1083 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 1084 */         if ("Nimbus".equals(info.getName())) {
/* 1085 */           UIManager.setLookAndFeel(info.getClassName());
/*      */           break;
/*      */         } 
/*      */       } 
/* 1089 */     } catch (ClassNotFoundException ex) {
/* 1090 */       Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1091 */     } catch (InstantiationException ex) {
/* 1092 */       Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1093 */     } catch (IllegalAccessException ex) {
/* 1094 */       Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1095 */     } catch (UnsupportedLookAndFeelException ex) {
/* 1096 */       Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, (String)null, ex);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1101 */     EventQueue.invokeLater(new Runnable() {
/*      */           public void run() {
/* 1103 */             (new Interfaz()).setVisible(true);
/*      */           }
/*      */         });
/*      */   }
/*      */ }


/* Location:              C:\Users\Usuario\OneDrive - Escuela Politécnica Nacional\Escritorio\ProyAuditoria\ProyectoEstructurasDeDatos.jar!\proyectoestructurasdedatos\Interfaz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */