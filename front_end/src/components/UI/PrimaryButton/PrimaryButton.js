import React from 'react';

import styles from './PrimaryButton.module.css';

const PrimaryButton = (props) => {
  const { 'primary-button': primaryButton } = styles;
  const classes = `${primaryButton} ${props.className}`;

  return (
    <button className={classes} type={props.type} onClick={props.onClick}>
      {props.children}
    </button>
  );
};

export default PrimaryButton;
