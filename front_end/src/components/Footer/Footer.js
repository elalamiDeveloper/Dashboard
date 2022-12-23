import React from 'react';

import styles from './Footer.module.css';

const Footer = (props) => {
  const { footer, created } = styles;
  const classes = `${footer} ${props.classes}`;

  return (
    <div className={classes}>
      Designed & Created By <span className={created}>EL ALAMI'S</span>
    </div>
  );
};

export default Footer;
