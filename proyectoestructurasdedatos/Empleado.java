/*     */ package proyectoestructurasdedatos;
/*     */ 
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
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
/*     */ 
/*     */ public class Empleado
/*     */ {
/*     */   private String codigo;
/*     */   private String nombres;
/*     */   private String apellidos;
/*     */   private String cargo;
/*     */   private String ultimaSucursal;
/*     */   private String direccion;
/*     */   private String correo;
/*     */   private String numTelf;
/*     */   
/*     */   public Empleado(String codigo, String nombres, String apellidos, String cargo, String ultimaSucursal, String direccion, String correo, String numTelf) {
/*  28 */     this.codigo = codigo;
/*  29 */     this.nombres = nombres;
/*  30 */     this.apellidos = apellidos;
/*  31 */     this.cargo = cargo;
/*  32 */     this.ultimaSucursal = ultimaSucursal;
/*  33 */     this.direccion = direccion;
/*  34 */     this.correo = correo;
/*  35 */     this.numTelf = numTelf;
/*     */   }
/*     */ 
/*     */   
/*     */   public Empleado() {}
/*     */ 
/*     */   
/*     */   public String getCodigo() {
/*  43 */     return this.codigo;
/*     */   }
/*     */   
/*     */   public void setCodigo(String codigo) {
/*  47 */     this.codigo = codigo;
/*     */   }
/*     */   
/*     */   public String getNombres() {
/*  51 */     return this.nombres;
/*     */   }
/*     */   
/*     */   public void setNombres(String nombres) {
/*  55 */     this.nombres = nombres;
/*     */   }
/*     */   
/*     */   public String getApellidos() {
/*  59 */     return this.apellidos;
/*     */   }
/*     */   
/*     */   public void setApellidos(String apellidos) {
/*  63 */     this.apellidos = apellidos;
/*     */   }
/*     */   
/*     */   public String getCargo() {
/*  67 */     return this.cargo;
/*     */   }
/*     */   
/*     */   public void setCargo(String cargo) {
/*  71 */     this.cargo = cargo;
/*     */   }
/*     */   
/*     */   public String getUltimaSucursal() {
/*  75 */     return this.ultimaSucursal;
/*     */   }
/*     */   
/*     */   public void setUltimaSucursal(String ultimaSucursal) {
/*  79 */     this.ultimaSucursal = ultimaSucursal;
/*     */   }
/*     */   
/*     */   public String getDireccion() {
/*  83 */     return this.direccion;
/*     */   }
/*     */   
/*     */   public void setDireccion(String direccion) {
/*  87 */     this.direccion = direccion;
/*     */   }
/*     */   
/*     */   public String getCorreo() {
/*  91 */     return this.correo;
/*     */   }
/*     */   
/*     */   public void setCorreo(String correo) {
/*  95 */     this.correo = correo;
/*     */   }
/*     */   
/*     */   public String getNumTelf() {
/*  99 */     return this.numTelf;
/*     */   }
/*     */   
/*     */   public void setNumTelf(String numTelf) {
/* 103 */     this.numTelf = numTelf;
/*     */   }
/*     */   
/*     */   public static boolean esCodigoValido(String codigo) {
/* 107 */     return codigo.matches("[GG|VD|CT|EB]\\-([0-9]{5})");
/*     */   }
/*     */   
/*     */   public int generarDigitos() {
/* 111 */     return (int)(10000.0D * Math.random());
/*     */   }
/*     */   
/*     */   public boolean esNombreValido(String nombre) {
/* 115 */     Pattern p = Pattern.compile("^[a-zA-Z\\s]{1,254}");
/* 116 */     Matcher m = p.matcher(nombre);
/* 117 */     return m.matches();
/*     */   }
/*     */   
/*     */   public boolean esApellidoValido(String apellido) {
/* 121 */     Pattern p = Pattern.compile("^[a-zA-Z\\s]{1,254}");
/* 122 */     Matcher m = p.matcher(apellido);
/* 123 */     return m.matches();
/*     */   }
/*     */   
/*     */   public boolean esDireccionValido(String direccion) {
/* 127 */     Pattern p = Pattern.compile("^[a-zA-Z\\s]{1,254}");
/* 128 */     Matcher m = p.matcher(direccion);
/* 129 */     return m.matches();
/*     */   }
/*     */   
/*     */   public boolean esCorreoValido(String correo) {
/* 133 */     Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
/* 134 */     Matcher m = p.matcher(correo);
/* 135 */     return m.matches();
/*     */   }
/*     */   public boolean esTelefonoValido(String telefono) {
/* 138 */     Pattern p = Pattern.compile("(^[09|08])[0-9]{9}");
/* 139 */     Matcher m = p.matcher(telefono);
/* 140 */     return m.matches();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 145 */     return "Empleado: " + this.nombres + " " + this.apellidos + "\nCódigo: " + this.codigo + "\nCargo: " + this.cargo + "\nÚltima Sucursal: " + this.ultimaSucursal + "\nDirección: " + this.direccion + "\nCorreo: " + this.correo + "\nNúmero de teléfono: " + this.numTelf + "\n";
/*     */   }
/*     */ }


/* Location:              C:\Users\Usuario\OneDrive - Escuela Politécnica Nacional\Escritorio\ProyAuditoria\ProyectoEstructurasDeDatos.jar!\proyectoestructurasdedatos\Empleado.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */