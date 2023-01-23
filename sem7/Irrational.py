class Irrational: 
    def __init__(self, value): #  это конструктор класса, который вызывается при создании объекта класса Irrational
        self.value = value
        
    def __repr__(self): # это нужно для того, чтобы при выводе объекта на экран, выводилось  3.14 
        return str(self.value) 
    
    def __add__(self, other): #  это метод класса, который вызывается при сложении объектов класса Irrational
        return Irrational(self.value + other.value)
    
    def __sub__(self, other):  
        return Irrational(self.value - other.value)
    
    def __mul__(self, other):
        return Irrational(self.value * other.value)
    
    def __truediv__(self, other):
        return Irrational(self.value / other.value)
