# part09 assignments

This folder contains copies of your Part 09 assignments from the TMC workspace.

Included assignments:

- part09-Part09_01.ABC
- part09-Part09_02.PersonAndSubclasses
- part09-Part09_03.Warehousing
- part09-Part09_04.DifferentKindsOfBoxes
- part09-Part09_05.TacoBoxes
- part09-Part09_06.InterfaceInABox
- part09-Part09_07.ListAsAMethodParameter
- part09-Part09_08.MapAsAMethodParameter
- part09-Part09_09.SetAsMethodParameter
- part09-Part09_10.OnlineShop
- part09-Part09_11.Herds
- part09-Part09_12.Animals

How to build and run

Each assignment is a separate Maven project (contains its own `pom.xml`). From the repository root you can run tests for a single assignment like this:

```bash
# run tests for assignment 01
mvn -f part09/part09-Part09_01.ABC test

# run tests for assignment 02
mvn -f part09/part09-Part09_02.PersonAndSubclasses test
```

Or run tests for all assignments (this will run each module's tests sequentially):

```bash
# from the repo root
for d in part09/part09-Part09_*; do mvn -f "$d" test || break; done
```

Notes

- Build artifacts (the `target/` folders) were excluded when copying.
- The original assignments remain in your TMC workspace; these are safe copies.
