# Docs
In this document you will find some instructions on how to use this project.<br/>

## Side info
- For more detailed information it's best to contact the `Author` of this project.
- This can be found on the `README.md` file in the root of this project.

## Java classes
The Java classes and records that are used in this project are:
- [**`Main`**](../src/main/java/Main.java)
> The `Main` class is the `entry point` of the application.<br/>
> The `Main` class contains 1 method, the `main` method.<br/>
> The `main` method is used for a sample run of the program which contains an `iterator` and a `List` with some data.
- [**`Farm`**](../src/main/java/chicken/Farm.java)
> The `Farm` record is used to create a new farm.<br/>
> The `Farm` record contains a `canonical constructor` and 2 method called `chickenType` and `checkFarm`.<br/>
> The `chickenType` method returns a list of chicken types.<br/>
> The `checkFarm` method takes 3 arguments: `int egg`, `String typeChicken` and `boolean isPsychical`.

## How does the conditions work?
> There have to be 0 or more eggs. Each farm can have no more than 1000 eggs stored and each basket stores exactly 20 
> eggs. Not less or more. <br/>
> The chicken types are listed in the List to match the chicken type.<br/>
> The eggs have to be located on a physical Farm.

## Test classes
The Test classes that are used in this project are:
- [**`CC`**](../src/main/test/CC.java)
- [**`DC`**](../src/main/test/DC.java)
- [**`CDC`**](../src/main/test/CDC.java)
- [**`MCDC`**](../src/main/test/MCDC.java)
- [**`MCC`**](../src/main/test/MCC.java)
- [**`EK`**](../src/main/test/EK.java)
- [**`PT`**](../src/main/test/PT.java)