# **Docodela**
#### **Video Demo: **<>
#### **Description:**

Docodela is the name of my final CS50x project. Docodela means Doctor in my local language.
Docodela 1.0 is the first version of an ambitiocious project about healthcare management app
written in Java for Android devices. When I was working in my country's health national system
as a Psychologyst I noticed the struggle the health technicians had to evaluate nutrition
condition of their HIV+ patients, which impact the quality of the follow-up of these patients.
Well, this is one of the reason made me look for and learn programming and computer science
from harvard extension school.

Many of these tecnicians do not even know how to calculate the body mass index even leaning on
their calculators. When they know how to, they take time computing the formula while having a large
queue of patients. This made me work on Docodela aiming to digitalize and facilitate the process of
evaluating the nutrition condition/state of the patients on ART with a simple but fascinating bmi calculator.

Docodela was developed in Androind Studio with Java as programming language. The target of
Docodela is health care system, specifically the technician who work directly with patients on ART. The
app will reduce time comsuming attending patient and will digitalize this process of calculating bmi
as so far they use printed matrices to find the bmi that best describe the bmi of a given patient.

Docodela has modern layout design. Its simplicist aim to be user friendly and its beauty aims to 
attract the finals users to it.

The activity_main xml file contains definition of the layout of the app. It contains the TextViews, TextViews
Button properties.
The trademark xml contains the trademark files witch is intended to be loaded in every activity at the bottom
of the app.
The source file is divided into 3 different classes (activities) and the user can jump from one activity to another
throth Intent (links) displayed in every layout of each activity file. The modularization of the app into three different
files was made in orde to divide the code into small pieces and of course due to differents formulas for computing the bmi
depending on the age of the patient. So we have activity for adults, form childrem and adolescents from 5-18 years old, and
infants from 0 to 5 (exclusive) years old. Adults require only weigth and height to compute the bmi, While chidren from
5 to 18 years old additionally will require the age and gender of the pating and then verify the range that the bmi falls 
to evaluate the bmi.

MainActivity java file contains the logic adults. It starts with field initialization, then user input
validation to prevent app for crashing. Docodela uses eventListeners to trigger actions based on the user
action over button. Depending on the action or event triggered Docodela may display toast messages to the user
informing the output in qualitative approache according to ministry of health guidelines on one hand and, on the other hang
clarify some output that might need further action from the tecnicians.

The activity_main xml and other xml files under layout folder contain the layout design and implementation for each activity.
The app use Linear androind layout.

The drawble resource contains the images or icones used throught Docodela. One of them was used as icon of 
the app Docodela. The values contain the colors definition used on the app. The mipmao contains additional images and icon
used through layout including background.

Docodela will evolve over time with new functionalities includind chat capabilities, blood bank database,
remote patient monitoring, AI capabilities as well as breast cancer detection throgh a photo and among other
functionalities. Will also move from java to kotlin due to trend in the development of modern android app.
This is a first step of long journey to pave. Thank you CS50 team for the free shared computer
science masterpiece classes.
