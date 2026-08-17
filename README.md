#  Ejercicio 10 — Cliente y Pedido

---

## 📝 Descripción

El sistema permite representar la entidad de un **Cliente** y relacionarla dinámicamente con múltiples **Pedidos**, gestionando el estado de cada orden (ej. *Pendiente, Procesado, Enviado*) y mostrando la información técnica y comercial de forma consolidada.

---

## 🚀 Funcionalidades y Requerimientos

### 📦 Clase `Cliente`

* **Atributos:**
  * Nombre (String)
  * Apellido (String)
  * Dni (int)

---

### 📦 Clase `Pedido`

* **Atributos:**
  * Monto Total (Double)
  * cantidad (int)
  * Estado (String / ej. *Pendiente*, *Enviado*, *Entregado*)
  * Cliente (Referencia Cliente)

* **Métodos:**
  * CambiarEstado(nuevoEstado): Actualiza el estado actual de la orden.
  * mostrarEstado(): Despliega la información completa del pedido, incluyendo los datos del cliente asociado, monto y estado del envío.

---

## 💻 Programa Principal (`main`)

Ejecuta la siguiente secuencia comercial:
1. Instancia un objeto de la clase Cliente.
2. Instancia **dos pedidos distintos** asociados al mismo cliente.
3. Modifica el estado de al menos uno de los pedidos para simular su avance logístico.
4. Muestra la información consolidada de ambos pedidos en pantalla.

---
