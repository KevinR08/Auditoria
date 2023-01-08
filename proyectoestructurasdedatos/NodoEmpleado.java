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
/*    */ 
/*    */ 
/*    */ public class NodoEmpleado
/*    */ {
/*    */   String codigo;
/*    */   NodoEmpleado enlace;
/*    */   
/*    */   public NodoEmpleado(String codigo) {
/* 19 */     this.codigo = codigo;
/* 20 */     this.enlace = null;
/*    */   }
/*    */   
/*    */   public String getCodigo() {
/* 24 */     return this.codigo;
/*    */   }
/*    */   
/*    */   public void setCodigo(String codigo) {
/* 28 */     this.codigo = codigo;
/*    */   }
/*    */   
/*    */   public NodoEmpleado getEnlace() {
/* 32 */     return this.enlace;
/*    */   }
/*    */   
/*    */   public void setEnlace(NodoEmpleado enlace) {
/* 36 */     this.enlace = enlace;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 41 */     return "Nodo: codigo=" + this.codigo + ", enlace=" + this.enlace;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\OneDrive - Escuela Politécnica Nacional\Escritorio\ProyAuditoria\ProyectoEstructurasDeDatos.jar!\proyectoestructurasdedatos\NodoEmpleado.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */