from Irrational import Irrational  # импортируем класс Irrational из  Irrational.py
from Complex import Complex  # импортируем класс Complex из  Complex.py

class Menu:
    def __init__(self): # создаем словарь, в котором ключами являются цифры, а значениями - функции
        self.operations = { 
            1: self.addition,  # присваиваем ключу 1 значение функции addition
            2: self.subtraction,
            3: self.multiplication,
            4: self.division
        }
        
    def display_menu(self): # создаем функцию display_menu, которая выводит на экран меню
        print("1. Addition") # выводим на экран пункт меню "Addition"
        print("2. Subtraction")
        print("3. Multiplication")
        print("4. Division")
        print("5. Exit")
        choice = int(input("Enter your choice: ")) #запрашиваем выбор
        return choice # возвращаем выбор 
        
    def addition(self): # создаем функцию addition, которая запрашивает  два числа и выводит их сумму
        number_type = self.select_number_type() # вызываем функцию select_number_type, которая запрашивает  тип чисел
        if number_type == 'irrational': # проверяем, если  тип чисел irrational, то  создаем два объекта класса Irrational
            num1 = Irrational(float(input("Enter first irrational number: "))) 
            num2 = Irrational(float(input("Enter second irrational number: ")))
            print(f"Result: {num1 + num2}") # выводим на экран сумму двух чисел
        elif number_type == 'complex': # проверяем, если  тип чисел complex, то создаем два объекта класса Complex  
            num1 = Complex(float(input("Enter real part of first complex number: ")), float(input("Enter imaginary part of first complex number: ")))  # запрашиваем  действительную и мнимую части первого числа
            num2 = Complex(float(input("Enter real part of second complex number: ")), float(input("Enter imaginary part of second complex number: "))) # запрашиваем  действительную и мнимую части второго числа
            print(f"Result: {num1 + num2}") # выводим на экран сумму двух чисел
            
    def subtraction(self): # создаем функцию subtraction
        number_type = self.select_number_type()
        if number_type == 'irrational':
            num1 = Irrational(float(input("Enter first irrational number: ")))
            num2 = Irrational(float(input("Enter second irrational number: ")))
            print(f"Result: {num1 - num2}")
        elif number_type == 'complex':
            num1 = Complex(float(input("Enter real part of first complex number: ")), float(input("Enter imaginary part of first complex number: ")))
            num2 = Complex(float(input("Enter real part of second complex number: ")), float(input("Enter imaginary part of second complex number: ")))
            print(f"Result: {num1 - num2}")
            
    def multiplication(self): # функцию multiplication
        number_type = self.select_number_type()
        if number_type == 'irrational':
            num1 = Irrational(float(input("Enter first irrational number: ")))
            num2 = Irrational(float(input("Enter second irrational number: ")))
            print(f"Result: {num1 * num2}")
        elif number_type == 'complex':
            num1 = Complex(float(input("Enter real part of first complex number: ")), float(input("Enter imaginary part of first complex number: ")))
            num2 = Complex(float(input("Enter real part of second complex number: ")), float(input("Enter imaginary part of second complex number: ")))
            print(f"Result: {num1 * num2}")
            
    def division(self): #  функцию division
        number_type = self.select_number_type()
        if number_type == 'irrational':
            num1 = Irrational(float(input("Enter first irrational number: ")))
            num2 = Irrational(float(input("Enter second irrational number: ")))
            print(f"Result: {num1 / num2}")
        elif number_type == 'complex':
            num1 = Complex(float(input("Enter real part of first complex number: ")), float(input("Enter imaginary part of first complex number: ")))
            num2 = Complex(float(input("Enter real part of second complex number: ")), float(input("Enter imaginary part of second complex number: ")))
            print(f"Result: {num1 / num2}")
            
    def select_number_type(self): # функцию select_number_type, которая запрашивает  тип чисел
        number_type = input("Select number type (irrational/complex): ").lower()
        while number_type != 'irrational' and number_type != 'complex':
            number_type = input("Invalid input. Select number type (irrational/complex): ").lower()
        return number_type

if __name__ == "__main__": # создаем класс Menu, который будет выводить на экран меню и запрашивать  выбор
    menu = Menu()
    while True:
        choice = menu.display_menu()
        if choice == 5:
            break
        menu.operations.get(choice, lambda: "Invalid choice")() # вызываем функцию, которая запрашивает  выбор
