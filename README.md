



# Health_care_app

## About the App
This app gives a general indicator of whether a person has a healthy body weight for their height. 
Specifically, the value obtained from the calculation of BMI is used to categorize whether a person is underweight, normal weight, overweight, or obese depending on what range the value falls between. 
Being overweight or underweight can have significant health effects, so while BMI is an imperfect measure of healthy body weight, 
it is a useful indicator of whether any additional testing or action is required.
Also it suggest you a Nutrition Chart based on your Age Group and on particular item how much Carbohydrate,Fat & Protein etc are present is also mentioned.


## Functionality :

- This application asks the user to enter his/her details which is required to calculate BMI Value.

- After entering all the details  when you press the Your Text button it will pronounce your name which you have entered and calculate button gives you your BMI value.

- On scrolling down Nutriton Chart is also made for the user according to his/her  age  group.


## Concepts Used :

In Activity Main XML File and Other XML Files :

 - Scroll View  and Linear Layout widget is used.
 - Text View and  Edit Text is used for writing and entering the details of the user.
 - Card View and Image View is used for the images in XML File.
 - Radio Group Button is used for selecting Male and Female.
 - Button widget makes the user easier to calculate BMI Value.
 - Recycler View Widget is used in making Nutrition Chart Section.
 - Pictures are imported in drawable file from Google.
 - Relative Layout is used for Nutrition Chart Section to make the Contents side by side.
 - Layout width, height, marginTop, padding, orientation, color, textSize, inputType etc..widgets are used.
 

In Main Activity Java and other Java File :

 - Intent  and startActivity is used to move from one activity to another.
 - findViewById and setOnClickListener so that when the user clicks on the Button the application gives the desired BMI Value.
 - If , elseIf ,else is used to check the condition of the user's age  and calculate accordingly.
 - Array Adapter and Recycler View is used to add the list of Nutrition Chart.
 - setupButtonClickListener is used for connecting the calculate Button to Java code so that the BMI value will be calculated.
 - In Array Adapter heading , Description & rating bar is added also Image is added in drawable file for each item.
 
 
 
 
 
 

![WhatsApp Image 2021-12-31 at 1 30 29 AM](https://user-images.githubusercontent.com/87956374/147784538-e0d47006-f222-4e5d-8346-4aab36204e54.jpeg)


https://drive.google.com/file/d/1IKlxgUBZrRJLW8Av8TbwZQkh8hx3HkN2/view?usp=sharing
