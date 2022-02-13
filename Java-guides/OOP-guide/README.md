# Гайд по ООП в целом и на примере Java
## Принципы ООП
1. **Абстракция** - это использование только тех характеристик объекта, которые с достаточной точностью представляют его 
в программе.  
То есть отвлечение от целостности объекта и выделение его главных свойств и составляющих, нужных нам.  
В языке программирования Java абстракция осуществляется через использование абстрактных классов и интерфейсов.
2. **Инкапсуляция** - это "сокрытие реализации". Другие классы не видят то, что видеть не должны: они не знают как 
работает метод, но они могут им пользоваться.
3. **Наследование** - это использование существующего класса как основа нового. При этом в новом (дочернем) классе есть 
возможность менять логику методов родителя (переопределять их), а также добавлять новые методы и переменные.
4. **Полиморфизм** - это возможность одинаково обращаться к объектам различных классов через интерфейс.  
В данном случае интерфейс - абстрактный класс, от которого наследованы все классы, к которым мы хотим единообразно обращаться.