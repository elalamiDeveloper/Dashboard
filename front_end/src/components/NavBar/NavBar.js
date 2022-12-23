/* eslint-disable jsx-a11y/anchor-is-valid */
import React, { useState } from 'react';

import styles from './NavBar.module.css';
import PrimaryButton from '../UI/PrimaryButton/PrimaryButton';

const NavBar = (props) => {
  const {
    'nav-bar': navBar,
    'nav-bar__list': navBarList,
    logo,
    'nav-bar__list__item': navBarItem,
  } = styles;

  const openInscriptionModal = (e) => {
    e.preventDefault();
    props.onHideInscriptionModal(false);
  };

  const openConnectionModal = (e) => {
    e.preventDefault();
    props.onHideConnectionModal(false);
  };

  return (
    <div className={navBar}>
      <div className={logo}>Dashbord</div>
      <nav>
        <ul className={navBarList}>
          <li className={navBarItem}>
            <a href="#" onClick={openConnectionModal}>
              Se connecter
            </a>
          </li>
          <li>
            <PrimaryButton onClick={openInscriptionModal}>
              S'inscrire
            </PrimaryButton>
          </li>
        </ul>
      </nav>
    </div>
  );
};

export default NavBar;
