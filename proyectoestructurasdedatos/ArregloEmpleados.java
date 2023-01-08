/*    */ package proyectoestructurasdedatos;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ArregloEmpleados
/*    */ {
/* 13 */   private final int tamaño = 13;
/*    */   private int numSucursal;
/*    */   private String[] arreglo;
/*    */   
/*    */   public ArregloEmpleados(int numSucursal) {
/* 18 */     this.numSucursal = numSucursal;
/* 19 */     this.arreglo = new String[13];
/* 20 */     for (int i = 0; i < this.arreglo.length; i++) {
/* 21 */       this.arreglo[i] = "";
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public ArregloEmpleados() {}
/*    */ 
/*    */   
/*    */   public void insertarCodigo(String codigo) {
/* 30 */     for (int i = 0; i < this.arreglo.length; i++) {
/* 31 */       if (this.arreglo[i].equals("")) {
/* 32 */         this.arreglo[i] = codigo;
/*    */         break;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void borrarCodigo(String info) {
/* 39 */     for (int i = 0; i < this.arreglo.length; i++) {
/* 40 */       if (this.arreglo[i].equals(info)) {
/* 41 */         this.arreglo[i] = "";
/*    */         break;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public String consultarEmpleado(String info) {
/* 48 */     for (int i = 0; i < this.arreglo.length; i++) {
/* 49 */       if (this.arreglo[i].equals(info)) {
/* 50 */         return info;
/*    */       }
/*    */     } 
/* 53 */     return "El empleado " + info + " no se encuentra en la sucursal " + this.numSucursal;
/*    */   }
/*    */   
/*    */   public String mostrarEstructura(ListaDEnlazada lista) {
/* 57 */     String texto = "";
/* 58 */     texto = texto + "Los siguientes empleados trabajan en la sucursal " + this.numSucursal + "\n";
/* 59 */     for (int i = 0; i < this.arreglo.length; i++) {
/* 60 */       if (!this.arreglo[i].equals("")) {
/* 61 */         texto = texto + "- " + this.arreglo[i] + ": " + lista.obtenerEmpleado(this.arreglo[i]) + "\n";
/*    */       }
/*    */     } 
/* 64 */     return texto;
/*    */   }
/*    */   
/*    */   public void vaciarArreglo() {
/* 68 */     for (int i = 0; i < 13; i++) {
/* 69 */       this.arreglo[i] = "";
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean estaVacio() {
/* 74 */     if (!this.arreglo[0].equals("")) {
/* 75 */       return false;
/*    */     }
/* 77 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\OneDrive - Escuela Politécnica Nacional\Escritorio\ProyAuditoria\ProyectoEstructurasDeDatos.jar!\proyectoestructurasdedatos\ArregloEmpleados.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */