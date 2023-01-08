/*     */ package proyectoestructurasdedatos;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TablaHashEnlazadaEmpleados
/*     */ {
/*  14 */   private final int tamaño = 4;
/*     */   private NodoEmpleado[] tabla;
/*     */   
/*     */   public TablaHashEnlazadaEmpleados() {
/*  18 */     this.tabla = new NodoEmpleado[4];
/*  19 */     for (int i = 0; i < 4; i++) {
/*  20 */       this.tabla[i] = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public TablaHashEnlazadaEmpleados(int tamaño) {
/*  25 */     this.tabla = new NodoEmpleado[tamaño];
/*  26 */     for (int i = 0; i < tamaño; i++) {
/*  27 */       this.tabla[i] = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public int aritmeticaModular(int clave) {
/*  32 */     getClass(); return clave % 4;
/*     */   }
/*     */   
/*     */   public void insertar(String codigo) {
/*  36 */     int numCodigo = Integer.parseInt(codigo.substring(3, 7));
/*  37 */     int numSucursal = aritmeticaModular(numCodigo);
/*  38 */     NodoEmpleado nuevoNodo = new NodoEmpleado(codigo);
/*  39 */     nuevoNodo.enlace = this.tabla[numSucursal];
/*  40 */     this.tabla[numSucursal] = nuevoNodo;
/*     */   }
/*     */   
/*     */   public void insertar(int posicion, String codigo) {
/*  44 */     int numSucursal = posicion;
/*  45 */     NodoEmpleado nuevoNodo = new NodoEmpleado(codigo);
/*  46 */     nuevoNodo.enlace = this.tabla[numSucursal];
/*  47 */     this.tabla[numSucursal] = nuevoNodo;
/*     */   }
/*     */   
/*     */   public void inicializar(String codigo, String numeroSucursal) {
/*  51 */     int numSucursal = Integer.parseInt(numeroSucursal);
/*  52 */     NodoEmpleado nuevoNodo = new NodoEmpleado(codigo);
/*  53 */     nuevoNodo.enlace = this.tabla[numSucursal];
/*  54 */     this.tabla[numSucursal] = nuevoNodo;
/*     */   }
/*     */   
/*     */   public void insertarEmpleadoTabla(String codigo, String numeroSucursal) {
/*  58 */     int numSucursal = Integer.parseInt(numeroSucursal);
/*  59 */     NodoEmpleado nuevoNodo = new NodoEmpleado(codigo);
/*  60 */     nuevoNodo.enlace = this.tabla[numSucursal];
/*  61 */     this.tabla[numSucursal] = nuevoNodo;
/*     */   }
/*     */   
/*     */   public void eliminarEmpleado(int numSucursal, String valor) {
/*  65 */     if (this.tabla[numSucursal - 1] != null) {
/*     */       
/*  67 */       NodoEmpleado anterior = null;
/*  68 */       NodoEmpleado actual = this.tabla[numSucursal - 1];
/*     */ 
/*     */       
/*  71 */       while (actual.enlace != null && !actual.codigo.equals(valor)) {
/*  72 */         anterior = actual;
/*  73 */         actual = actual.enlace;
/*     */       } 
/*  75 */       if (!actual.codigo.equals(valor)) {
/*     */         
/*  77 */         System.out.println("No existe registro del empleado" + valor);
/*  78 */       } else if (anterior == null) {
/*     */ 
/*     */         
/*  81 */         this.tabla[numSucursal - 1] = actual.enlace;
/*     */       }
/*     */       else {
/*     */         
/*  85 */         anterior.enlace = actual.enlace;
/*     */       } 
/*     */       
/*  88 */       actual = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public NodoEmpleado obtenerPrimerNodo(int i) {
/*  93 */     return this.tabla[i];
/*     */   }
/*     */   
/*     */   public void vaciarTabla() {
/*  97 */     for (int i = 0; i < this.tabla.length; i++) {
/*  98 */       this.tabla[i] = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public String mostrarEstructura() {
/* 103 */     String texto = "";
/*     */     
/* 105 */     for (int i = 0; i < this.tabla.length; i++) {
/* 106 */       if (this.tabla[i] != null) {
/*     */ 
/*     */         
/* 109 */         texto = texto + "|Sucursal " + (i + 1) + "|";
/* 110 */         NodoEmpleado aux = this.tabla[i];
/* 111 */         int salida = 0;
/* 112 */         while (salida == 0) {
/* 113 */           if (aux.enlace != null) {
/* 114 */             texto = texto + " -> " + aux.codigo;
/* 115 */             aux = aux.enlace;
/* 116 */             salida = 0; continue;
/*     */           } 
/* 118 */           texto = texto + " -> " + aux.codigo + " -> null";
/* 119 */           aux = aux.enlace;
/* 120 */           salida = 1;
/*     */         } 
/*     */         
/* 123 */         texto = texto + "\n";
/*     */       } else {
/*     */         
/* 126 */         texto = texto + "|Sucursal " + (i + 1) + "|-> null\n";
/*     */       } 
/*     */     } 
/* 129 */     return texto;
/*     */   }
/*     */   
/*     */   public NodoEmpleado getNodoEmpleado(int i) {
/* 133 */     return this.tabla[i];
/*     */   }
/*     */ }


/* Location:              C:\Users\Usuario\OneDrive - Escuela Politécnica Nacional\Escritorio\ProyAuditoria\ProyectoEstructurasDeDatos.jar!\proyectoestructurasdedatos\TablaHashEnlazadaEmpleados.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */