import React, { Component } from 'react';

import styles from './User.module.css';

import SideBar from '../SideBar/SideBar';
import MainUser from '../MainUser/MainUser';
import Footer from '../Footer/Footer';

class User extends Component {
  constructor() {
    super();
    this.state = {};
  }

  componentDidMount() {
    fetch('https://bible-api.com/john 3:16')
      .then((prom) => prom.json())
      .then((data) => console.log(data));
  }

  render() {
    const { user, footer: footerStyle } = styles;

    return (
      <div className={user}>
        <SideBar />
        <MainUser />
        <Footer classes={footerStyle} />
      </div>
    );
  }
}

export default User;
