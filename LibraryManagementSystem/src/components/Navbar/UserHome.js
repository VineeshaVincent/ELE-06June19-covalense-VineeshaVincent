import React, { Component } from 'react'
import './UserHome.css';
export class UserHome extends Component {
    render() {
        return (
            <div className="topnav">
            <a className="active" href="./home">Home</a>
         
            <a href="#book">Book</a>
            <a href="./logout">Logout</a>
            <div className="search-container">
              
              <form action="" method="get">
                <input type="text" placeholder="search book/category/author" name="search" />
                <button className="primary" type="submit">Search</button>
              </form>
            </div>
          </div>
        )
    }
}

export default UserHome
