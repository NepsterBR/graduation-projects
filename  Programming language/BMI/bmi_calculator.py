def calculate_bmi(weight, height):
    bmi = weight / (height ** 2)
    return bmi


def interpret_bmi(bmi):
    if bmi < 18.5:
        return "Underweight"
    elif bmi < 25:
        return "Normal weight"
    elif bmi < 30:
        return "Overweight"
    else:
        return "Obesity"


def main():
    weight = float(input("Enter your weight in kg: "))
    height = float(input("Enter your height in meters: "))

    bmi = calculate_bmi(weight, height)
    interpretation = interpret_bmi(bmi)

    print("Your BMI is:", bmi)
    print("Interpretation:", interpretation)


if __name__ == "__main__":
    main()
