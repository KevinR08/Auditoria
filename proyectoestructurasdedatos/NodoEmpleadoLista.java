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
/*    */ public class NodoEmpleadoLista
/*    */ {
/*    */   public Empleado info;
/*    */   public NodoEmpleadoLista adelante;
/*    */   public NodoEmpleadoLista atras;
/*    */   
/*    */   public void crearNodo(Empleado empleado) {
/* 18 */     this.info = empleado;
/* 19 */     this.adelante = null;
/* 20 */     this.atras = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Empleado getInfo() {
/* 28 */     return this.info;
/*    */   }
/*    */   
/*    */   public void setInfo(Empleado info) {
/* 32 */     this.info = info;
/*    */   }
/*    */   
/*    */   public NodoEmpleadoLista getAdelante() {
/* 36 */     return this.adelante;
/*    */   }
/*    */   
/*    */   public void setAdelante(NodoEmpleadoLista adelante) {
/* 40 */     this.adelante = adelante;
/*    */   }
/*    */   
/*    */   public NodoEmpleadoLista getAtras() {
/* 44 */     return this.atras;
/*    */   }
/*    */   
/*    */   public void setAtras(NodoEmpleadoLista atras) {
/* 48 */     this.atras = atras;
/*    */   }
/*    */ }


/* Location:              C:\Users\Usuario\OneDrive - Escuela Politécnica Nacional\Escritorio\ProyAuditoria\ProyectoEstructurasDeDatos.jar!\proyectoestructurasdedatos\NodoEmpleadoLista.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */