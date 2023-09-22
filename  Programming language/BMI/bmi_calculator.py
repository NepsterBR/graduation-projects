def calculate_bmi(weight, height):
    bmi = weight / (height ** 2)
    return bmi


def interpret_bmi(bmi):
    if bmi < 18.5:
        return "Underweight"
    elif 18.5 <= bmi <= 24.9:
        return "Normal weight"
    elif 25 <= bmi <= 29.9:
        return "Overweight"
    else:
        return "Obesity"


def main():
    weight = float(input("Enter your weight in kg: "))
    height = float(input("Enter your height in meters: "))

    bmi = calculate_bmi(weight, height)
    interpretation = interpret_bmi(bmi)

    print("\nYour BMI is:", "{:.2f}".format(bmi))
    print("\nInterpretation:", interpretation)


if __name__ == "__main__":
    main()
