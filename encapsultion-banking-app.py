# File: main.py

class MyClass:
    def public_method(self, msg: str):
        print("Public:", msg)

    def _protected_method(self):
        print("Protected method")

    def _default_method(self):  # No exact 'default' in Python, treated same as protected
        print("Default method")

    def __private_method(self):
        print("Private method")

    def add(self, a: int, b: int) -> int:
        return a + b


def main():
    obj = MyClass()

    # ✅ Correct call to public method with String argument
    obj.public_method("Hello")

    # ❌ Error: passing wrong type of argument (int instead of str)
    try:
        obj.public_method(123)  # Still works in Python, but conceptually incorrect
    except TypeError as e:
        print("Error:", e)

    # ✅ Simulated protected method access (allowed but not recommended)
    obj._protected_method()

    # ✅ Simulated default access (same as protected in Python)
    obj._default_method()

    # ❌ Error: private method not accessible (name mangled)
    try:
        obj.__private_method()
    except AttributeError as e:
        print("Error:", e)

    # ✅ Correct method call with two ints
    sum_result = obj.add(2, 3)
    print("Sum:", sum_result)

    # ❌ Error: too many arguments
    try:
        obj.add(1, 2, 3)
    except TypeError as e:
        print("Error:", e)


if __name__ == "__main__":
    main()
