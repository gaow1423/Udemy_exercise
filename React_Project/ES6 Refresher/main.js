//CONST & LET

// let name = 'John';
// name = 'Jack';

// //const object or const array can be manipulated
// const person = {
//   name: 'John',
//   age: 33
// };

// person.name = 'Jack';
// const nums = [1, 2, 3, 4];
// nums.push(5);

// //ARROW FUNCTIONS
// const sayHello = (name, greet) => {
//   //   console.log(name + 'say' + greet);
// };
// sayHello('gaow', 'ii');

// //FOREACH
// const fruits = ['Apples', 'Oranges', 'Grapes'];
// fruits.forEach((fruit, index) => console.log(fruit));

// //MAP
// //this is very similar to forEach function
// const singleFruit = fruits.map(fruit => fruit.slice(0, -1).toUpperCase());

// //FILTER
// const people = [
//   { id: 1, name: 'Karen' },
//   { id: 2, name: 'Bob' },
//   { id: 3, name: 'Sharon' }
// ];

// const people2 = people.filter(person => person.id !== 2);
// console.log(people2);

// //SPREAD
// const arr = [1, 2, 3];
// const arr2 = [...arr, 4];
// const arr3 = [...arr.filter(num => num !== 2)];

// const person1 = {
//   name: 'Brad',
//   age: 36
// };

// const Person2 = {
//   ...person1,
//   email: 'brad@gmail.com'
// };
// consule.log(arr3);
// console.log(Person2);

//Destructuring
const profile = {
  name: 'John Doe',
  address: {
    street: '40 Main st',
    city: 'Boston'
  },
  hobbies: ['movies', 'music']
};
const { name, address, hobbies } = profile; //pull name, address, and hobbies out.

console.log(name, address.street, hobbies[0]);

//ClASSES
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  greet() {
    return `Hello. my name is ${this.name} and I am ${this.age}`;
  }
}
const person1 = new Person('John', 33);
const person2 = new Person('Sara', 28);

console.log(person2.greet());

//SUBCLASS
class Customer extends Person {
  constructor(name, age, balance) {
    super(name, age);
    this.balance = balance;
  }
  info() {
    return `${this.name} owes ${this.balance}`;
  }
}

const customer1 = new Customer('Kevin', 32, 300);
console.log(customer1.info());