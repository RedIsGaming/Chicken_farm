# Docs
In this document you will find `some instructions` on how to use this project.

## Side info
- For more detailed information it's best to contact the `Author` of this project.
- This can be found on the `README.md` file in the root of this project.

## How does the conditions work?
+ Each basket stores `exactly 20 eggs`. If the test doesn't come in pairs of 20, it will be false.
+ The chicken types are `listed in the List` to match the chicken type. If it's not a chicken type, it will be false.
+ The eggs have to be `psychically located` on the Farm itself. If it's not located on the Farm, it will be false.
+ The eggs can be `bought from the Farm itself`. It can be in pairs of 20 exactly `from 0 to 1000`.
+ There are `3 price options` for this `in different categories` for the eggs.
+ There are also `3 price options` for broilers `in different categories`.

## Java classes
The Java classes that are used in this project are:
- [**`Main`**](../src/main/java/Main.java) with 1 method.
> The `Main` class is used as an entry point for this project. It contains 1 method: `main`.

## Java records
The Java records that are used in this project are:
- [**`Farm`**](../src/main/java/chicken/Farm.java) with 2 methods.
> The `Farm` record is used to create new Farm objects. It contains 2 methods: `chickenType` and `checkFarm`.<br/>
> The `chickenType` method is used to check if the chicken type is in the list and matches with them.<br/>
> The `checkFarm` method is used to check if the eggs are psychically located on the farm itself and if the eggs are in 
> pairs of 20. Combined with the `chickenType` method as condition.
- [**`Egg`**](../src/main/java/chicken/Egg.java) with 4 methods.
> The `Egg` record is used to create new Egg objects. It contains 4 methods: `checkEgg`, `eggOption1`, `eggOption2` and
> `eggOption3`.<br/>
> The `checkEgg` method is used to group the eggs in the right category and if the eggs are in the range of 0 to 1000.
> <br/>
> The `checkEgg` is then combined with the `eggOption1`, `eggOption2` and `eggOption3` methods as condition.<br/>
> The `eggOption1` method is used for eggs that are in the range of 0 to 200. The price is the egg times 0.25.<br/>
> The `eggOption2` method is used for eggs that are in the range of 201 to 500. The price is the egg times 0.20.<br/>
> The `eggOption3` method is used for eggs that are in the range of 501 to 1000. The price is the egg times 0.15.
- [**`Environment`**](../src/main/java/chicken/Environment.java) with 3 methods.
> The `Environment` record is used to create new Environment objects. It contains 3 methods: `eggOrMeatOption1`,
> `eggOrMeatOption2` and `eggOrMeatOption3`.<br/>
> The `eggOrMeatOption` with number methods are combined with the `checkFarm` and `checkEgg` methods as condition.<br/>
> The `eggOrMeatOption1` checks if the eggs are divided by 20 and sets the egg price to egg times 0.25. If it's a
> broiler chicken and outside the stack mark, it will be false. It returns false if it's not a broiler chicken.<br/>
> The `eggOrMeatOption2` checks if the eggs are divided by 20 and sets the egg price to egg times 0.20. If it's a
> broiler chicken and outside the stack mark, it will be false. It returns false if it's not a broiler chicken.<br/>
> The `eggOrMeatOption3` checks if the eggs are divided by 20 and sets the egg price to egg times 0.15. If it's a
> broiler chicken and outside the stack mark, it will be false. It returns false if it's not a broiler chicken.

## Test classes
The Test classes that are used in this project are:
- [**`CC`**](../src/main/test/CC.java) with 2 test conditions.
- [**`DC`**](../src/main/test/DC.java) with 2 test conditions.
- [**`CDC`**](../src/main/test/CDC.java) with 4 test conditions.
- [**`MCDC`**](../src/main/test/MCDC.java) with 4 test conditions.
- [**`MCC`**](../src/main/test/MCC.java) with 8 test conditions.
- [**`EKBVA`**](../src/main/test/EKBVA.java) with 12 test conditions.
- [**`PT`**](../src/main/test/PT.java) with 6 test conditions.
> The `CC` class is used to test the `Condition Coverage`. It contains 2 (test) methods: `checkFarm` with different
> numbers.<br/>
> The `DC` class is used to test the `Decision Coverage`. It contains 2 (test) methods: `checkFarm` with different
> numbers.<br/>
> The `CDC` class is used to test the `Condition Decision Coverage`. It contains 4 (test) methods: `checkFarm` with
> different numbers.<br/>
> The `MCDC` class is used to test the `Modified Condition Decision Coverage`. It contains 4 (test) methods: `checkFarm`
> with different numbers.<br/>
> The `MCC` class is used to test the `Multiple Condition Coverage`. It contains 8 (test) methods: `checkFarm` with
> different numbers.<br/>
> The `EKBVA` class is used to test the `Equivalence Classes Boundary Value Analysis`. It contains 12 (test) methods: 
> `checkEgg` with different numbers.<br/>
> The `PT` class is used to test the `Pairwise Testing`. It contains 6 (test) methods: `checkEnvironment` with different
> numbers.<br/>