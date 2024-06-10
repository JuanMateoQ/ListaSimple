# Lista Simple

## Descripción

Este repositorio contiene la implementación de una lista simple en Python. Una lista simple es una estructura de datos lineal que consiste en una secuencia de nodos, donde cada nodo contiene un dato y una referencia al siguiente nodo en la secuencia. Esta estructura permite almacenar y gestionar una colección de elementos de manera eficiente.

## Características

- **Inserción**: Permite añadir elementos al principio, al final o en una posición específica de la lista.
- **Eliminación**: Permite eliminar elementos del principio, del final o de una posición específica de la lista.
- **Búsqueda**: Permite buscar un elemento específico dentro de la lista.
- **Visualización**: Permite imprimir la lista completa para visualizar los elementos almacenados.

## Estructura del Repositorio

- `simple_list.py`: Contiene la implementación de la lista simple.
- `example.py`: Contiene un ejemplo de aplicación utilizando la lista simple.

## Uso

### simple_list.py

```python
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class SimpleList:
    def __init__(self):
        self.head = None

    def insert_at_beginning(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_at_end(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node

    def insert_at_position(self, position, data):
        if position < 0:
            raise IndexError("Índice fuera de rango")
        new_node = Node(data)
        if position == 0:
            new_node.next = self.head
            self.head = new_node
            return
        current = self.head
        for _ in range(position - 1):
            if not current:
                raise IndexError("Índice fuera de rango")
            current = current.next
        new_node.next = current.next
        current.next = new_node

    def delete_at_beginning(self):
        if not self.head:
            raise ValueError("La lista está vacía")
        self.head = self.head.next

    def delete_at_end(self):
        if not self.head:
            raise ValueError("La lista está vacía")
        if not self.head.next:
            self.head = None
            return
        second_last = self.head
        while second_last.next.next:
            second_last = second_last.next
        second_last.next = None

    def delete_at_position(self, position):
        if position < 0 or not self.head:
            raise IndexError("Índice fuera de rango")
        if position == 0:
            self.head = self.head.next
            return
        current = self.head
        for _ in range(position - 1):
            if not current.next:
                raise IndexError("Índice fuera de rango")
            current = current.next
        if not current.next:
            raise IndexError("Índice fuera de rango")
        current.next = current.next.next

    def search(self, data):
        current = self.head
        position = 0
        while current:
            if current.data == data:
                return position
            current = current.next
            position += 1
        return -1

    def display(self):
        elements = []
        current = self.head
        while current:
            elements.append(current.data)
            current = current.next
        return elements
