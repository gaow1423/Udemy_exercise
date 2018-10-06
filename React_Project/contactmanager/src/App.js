import React, { Component } from 'react';
// import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Contact from './components/Contact';
import Header from './components/Header';

class App extends Component {
  render() {
    //   const name = 'Larry';
    //   const showHello = false;
    //   const showMath = true;
    //   const num1 = 40;
    //   const num2 = 23;

    //   let math;
    //   if (showMath) {
    //     math = (
    //       <h4>
    //         {num1} + {num2} = {num1 + num2}
    //       </h4>
    //     );
    //   } else {
    //     math = null;
    //   }

    // return (
    //   <div className="App">
    //     <h1>The App Component</h1>
    //     {showHello ? <h4>Hello {name.toUpperCase()}</h4> : null}
    //     {math}
    //   </div>
    // );
    // }
    return (
      <div className="App">
        <Header branding="Contact Manager" />
        <div className="container">
          <Contact
            name="John Doe"
            email="jdoe@gmail.com"
            phone="555-555-5555"
          />
          <Contact
            name="Wei Gao"
            email="gaow1423@gmail.com"
            phone="555-555-5555"
          />
        </div>
      </div>
    );
  }
}

export default App;
