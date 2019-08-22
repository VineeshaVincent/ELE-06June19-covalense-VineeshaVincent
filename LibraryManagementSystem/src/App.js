import React from 'react';
import Login from './components/login/Login';
import { BrowserRouter as Router, Route } from 'react-router-dom'
import UserHome from './components/Navbar/UserHome';
import AdminHome from './components/Navbar/AdminHome';
import LibrarianHome from './components/Navbar/LibrarianHome';
import CreateAccount from './components/CreateAccount';

function App() {
  return (
    <Router>
    <Route exact path='/' component={Login}/>
    <Route exact path='/userhome' component={UserHome}/>
    <Route exact path='/adminhome' component={AdminHome}/>
    <Route exact path='/librarianhome' component={LibrarianHome}/>
    <Route exact path='/createaccount' component={CreateAccount}/>
    </Router>
  );
}

export default App;
