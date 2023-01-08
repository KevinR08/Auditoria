/*     */ package proyectoestructurasdedatos;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.io.PrintWriter;
/*     */ import javax.lang.model.SourceVersion;
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
/*     */ public class ListaDEnlazada
/*     */ {
/*  19 */   private NodoEmpleadoLista cabecera = null;
/*     */ 
/*     */   
/*     */   public NodoEmpleadoLista getCabecera() {
/*  23 */     return this.cabecera;
/*     */   }
/*     */   
/*     */   public void setCabecera(NodoEmpleadoLista cabecera) {
/*  27 */     this.cabecera = cabecera;
/*     */   }
/*     */   
/*     */   public String mostrar() {
/*  31 */     String texto = "";
/*  32 */     if (this.cabecera == null) {
/*  33 */       return null;
/*     */     }
/*  35 */     texto = texto + null + " <--- ";
/*  36 */     NodoEmpleadoLista actual = this.cabecera;
/*  37 */     while (actual.getAdelante() != null) {
/*  38 */       texto = texto + actual.getInfo() + " <---> ";
/*  39 */       actual = actual.getAdelante();
/*     */     } 
/*  41 */     texto = texto + actual.getInfo() + " ---> " + null;
/*  42 */     return texto;
/*     */   }
/*     */   
/*     */   public void insertarOrdenado(Empleado empleado) {
/*  46 */     NodoEmpleadoLista insertObject = new NodoEmpleadoLista();
/*  47 */     insertObject.crearNodo(empleado);
/*  48 */     if (this.cabecera == null) {
/*  49 */       this.cabecera = insertObject;
/*  50 */       this.cabecera.setAtras(null);
/*  51 */       this.cabecera.setAdelante(null);
/*     */     } else {
/*  53 */       NodoEmpleadoLista temp = this.cabecera;
/*  54 */       if (empleado.getCodigo().compareTo(temp.getInfo().getCodigo()) < 0) {
/*  55 */         insertObject.setAdelante(temp);
/*  56 */         temp.setAtras(insertObject);
/*  57 */         insertObject.setAtras(null);
/*  58 */         this.cabecera = insertObject;
/*     */       } else {
/*  60 */         NodoEmpleadoLista tempIzq = temp;
/*  61 */         NodoEmpleadoLista tempDer = temp.getAdelante();
/*  62 */         while (tempIzq.getAdelante() != null) {
/*  63 */           if (empleado.getCodigo().compareTo(tempDer.getInfo().getCodigo()) < 0) {
/*  64 */             insertObject.setAdelante(tempDer);
/*  65 */             insertObject.setAtras(tempIzq);
/*  66 */             tempIzq.setAdelante(insertObject);
/*  67 */             tempDer.setAtras(insertObject);
/*     */             break;
/*     */           } 
/*  70 */           tempIzq = tempIzq.getAdelante();
/*  71 */           tempDer = tempDer.getAdelante();
/*     */         } 
/*     */         
/*  74 */         if (tempIzq.getAdelante() == null) {
/*  75 */           insertObject.setAtras(tempIzq);
/*  76 */           tempIzq.setAdelante(insertObject);
/*  77 */           insertObject.setAdelante(null);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public String obtenerEmpleado(String codigo) {
/*  84 */     String empleado = "";
/*  85 */     NodoEmpleadoLista actual = this.cabecera;
/*  86 */     while (!actual.getInfo().getCodigo().equals(codigo)) {
/*  87 */       actual = actual.getAdelante();
/*     */     }
/*  89 */     empleado = empleado + actual.getInfo().getNombres();
/*  90 */     empleado = empleado + " " + actual.getInfo().getApellidos();
/*  91 */     return empleado;
/*     */   }
/*     */   
/*     */   public void actualizaFichero() {
/*  95 */     File fichero = null;
/*  96 */     FileWriter fw = null;
/*  97 */     PrintWriter pw = null;
/*  98 */     NodoEmpleadoLista actual = this.cabecera;
/*  99 */     String cadena = "";
/*     */     try {
/* 101 */       int j = 0;
/* 102 */       while (j == 0) {
/* 103 */         if (actual.adelante != null) {
/* 104 */           fichero = new File("registroEmpleados2.txt");
/* 105 */           fw = new FileWriter(fichero);
/* 106 */           pw = new PrintWriter(fw);
/* 107 */           cadena = cadena + actual.getInfo().getCodigo() + ",";
/* 108 */           cadena = cadena + actual.getInfo().getNombres() + ",";
/* 109 */           cadena = cadena + actual.getInfo().getApellidos() + ",";
/* 110 */           cadena = cadena + actual.getInfo().getCargo() + ",";
/* 111 */           cadena = cadena + actual.getInfo().getUltimaSucursal() + ",";
/* 112 */           cadena = cadena + actual.getInfo().getDireccion() + ",";
/* 113 */           cadena = cadena + actual.getInfo().getCorreo() + ",";
/* 114 */           cadena = cadena + actual.getInfo().getNumTelf() + "\n";
/* 115 */           String cadena2 = cadena;
/* 116 */           pw.println(cadena2 + "\n");
/* 117 */           actual = actual.adelante; continue;
/*     */         } 
/* 119 */         fichero = new File("registroEmpleados2.txt");
/* 120 */         fw = new FileWriter(fichero);
/* 121 */         pw = new PrintWriter(fw);
/* 122 */         cadena = cadena + actual.getInfo().getCodigo() + ",";
/* 123 */         cadena = cadena + actual.getInfo().getNombres() + ",";
/* 124 */         cadena = cadena + actual.getInfo().getApellidos() + ",";
/* 125 */         cadena = cadena + actual.getInfo().getCargo() + ",";
/* 126 */         cadena = cadena + actual.getInfo().getUltimaSucursal() + ",";
/* 127 */         cadena = cadena + actual.getInfo().getDireccion() + ",";
/* 128 */         cadena = cadena + actual.getInfo().getCorreo() + ",";
/* 129 */         cadena = cadena + actual.getInfo().getNumTelf() + "\n";
/* 130 */         pw.println(cadena + "\n");
/* 131 */         j = 1;
/*     */       }
/*     */     
/*     */     }
/* 135 */     catch (Exception e) {
/* 136 */       e.printStackTrace();
/*     */     } finally {
/*     */       try {
/* 139 */         if (fw != null) {
/* 140 */           fw.close();
/*     */         }
/* 142 */       } catch (Exception e) {
/* 143 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SourceVersion getSupportedSourceVersion() {
/* 151 */     return SourceVersion.latest();
/*     */   }
/*     */ }


/* Location:              C:\Users\Usuario\OneDrive - Escuela Politécnica Nacional\Escritorio\ProyAuditoria\ProyectoEstructurasDeDatos.jar!\proyectoestructurasdedatos\ListaDEnlazada.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */