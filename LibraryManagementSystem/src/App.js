import React from 'react';
import Login from './components/login/Login';
import { BrowserRouter as Router, Route } from 'react-router-dom'
import UserHome from './components/Navbar/UserHome';
import AdminHome from './components/Navbar/AdminHome';

function App() {
  return (
    <Router>
    <Route exact path='/' component={Login}/>
    <Route exact path='/userhome' component={UserHome}/>
    <Route exact path='/adminhome' component={AdminHome}/>
    </Router>
  );
}

export default App;
