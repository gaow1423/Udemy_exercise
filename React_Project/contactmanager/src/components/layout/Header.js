import React from 'react';
import PropTypes from 'prop-types';
import { Link } from 'react-router-dom';

//function method as follow:
// function Header() {
//   return (
//     <div>
//       <h1>Contact Manager</h1>
//     </div>
//   );
// }

//arrow function as follow:
const Header = props => {
  const { branding } = props;
  return (
    // <div>
    //   <h1 style={headingStyle}> {branding}</h1>
    // </div>
    <nav className="navbar navbar-expand-sm navbar-dark bg-danger mb-3 py-0">
      <div className="container">
        <a href="/" className="navbar-brand" style={headingStyle}>
          {branding}
        </a>
        <div>
          <ul className="navbar-nav mr-auto">
            <li className="nav-item">
              <Link to="/" className="nav-link" style={headingStyle}>
                <i className="fas fa-home" />
                Home
              </Link>
            </li>

            <li className="nav-item">
              <Link to="/contact/add" className="nav-link" style={headingStyle}>
                <i className="fas fa-home" />
                Add
              </Link>
            </li>

            <li className="nav-item">
              <Link to="/about" className="nav-link" style={headingStyle}>
                <i className="fas fa-home" />
                About
              </Link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

Header.defaultProps = {
  branding: 'My App'
};
Header.propTypes = {
  branding: PropTypes.string.isRequired
};
const headingStyle = {
  color: 'White',
  frontSize: '30px'
};

export default Header;
