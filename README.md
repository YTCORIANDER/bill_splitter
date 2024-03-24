# Bill Splitter
Welcome to the Bill Splitter! 💸 This Java project provides functionality for fair division of expenses among a group of individuals.

## About
Bill Splitter is designed to simplify the process of splitting bills among friends, roommates, or colleagues. It offers an efficient solution for dividing expenses, taking into account varying amounts owed by each participant.

## Features
- **Recursive Splitting**: Utilizes recursive algorithms to find subsets of expenses that sum up to target amounts.
- **Unique Order List**: Implements a custom data structure to manage ordered lists of unique elements efficiently.
- **Flexible Input**: Supports input in the form of arrays or custom iterable structures.
- **Robust Iterator**: Implements a robust iterator for traversing and copying list elements.

## Usage
To split bills using the Bill Splitter:

1. Create an instance of the `UniqueOrderedList` class.
2. Populate the list with individual expenses using the `add()` method.
3. Call the `split()` method with the list of expenses and the target amount to split.
4. Retrieve the result, which provides a fair distribution of expenses among participants.

Example usage:
```java
UniqueOrderedList<Integer> expenses = new UniqueOrderedList<>(new Integer[]{10, 20, 30, 40, 50});
int targetAmount = 100;
UniqueOrderedList<Integer> splitExpenses = BillSplitter.split(expenses, targetAmount);
```

## Contributing
Contributions to enhance the functionality or improve the code quality of the Bill Splitter are welcome! If you'd like to contribute, please follow the [contribution guidelines](CONTRIBUTING.md).

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any questions or suggestions regarding the Bill Splitter, feel free to reach out.

Happy bill splitting! 💰📑
