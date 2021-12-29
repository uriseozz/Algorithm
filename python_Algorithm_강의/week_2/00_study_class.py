class Person:
    def __init__(self, param_name):  # constructor(__init__)를 생성하거나 내부에 있는 함수를 만들때 인자에 자기 자신을 넘겨줌(self)
        print("i am created!", self)
        self.name = param_name

    def talk(self):  # 클래스 내부의 함수는 메소드라 불림
        print("안녕하세요, 제이름은", self.name, "입니다")

person_1 = Person("유재석")
print(person_1.name)
print(person_1)
person_1.talk()

person_2 = Person("박명수")
print(person_2.name)
print(person_2)
person_2.talk()