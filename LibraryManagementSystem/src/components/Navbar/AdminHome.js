import React, { Component } from 'react'
import './AdminHome.css';
import{ Link  } from 'react-router-dom'
export class AdminHome extends Component {
    render() {
        return (

            <ul>
              <li><a href="#home">Home</a></li>
              <li><a href="#users">Users</a></li>
              <li><Link to="/createaccount">Add User</Link></li>
              <li style={{float: 'right'}}><a className="active" href="#logout">Logout</a></li>
             
            </ul>
          );
    }
}

export default AdminHome
