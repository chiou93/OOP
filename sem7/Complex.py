class Complex:
    def __init__(self, real, imag): #  это конструктор класса, который вызывается при создании объекта класса Complex, где real и imag - аргументы конструктора
        self.real = real 
        self.imag = imag
        
    def __repr__(self): 
        return f'{self.real} + {self.imag}i' #  это нужно для того, чтобы при выводе объекта на экран, выводилось  3.14 + 2.71i
    
    def __add__(self, other): #  это метод класса, который вызывается при сложении объектов класса Complex
        return Complex(self.real + other.real, self.imag + other.imag) #  возвращаем новый объект класса Complex
    
    def __sub__(self, other): 
        return Complex(self.real - other.real, self.imag - other.imag) 
    
    def __mul__(self, other):
        real = self.real * other.real - self.imag * other.imag 
        imag = self.real * other.imag + self.imag * other.real 
        return Complex(real, imag)
    
    def __truediv__(self, other): #  возвращает self / other если other != 0 
        conjugate = Complex(other.real, -other.imag) 
        numerator = self * conjugate 
        denominator = other * conjugate 
        return Complex(numerator.real / denominator.real, numerator.imag / denominator.real) 
