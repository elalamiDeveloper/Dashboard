/* eslint-disable jsx-a11y/img-redundant-alt */
import React from 'react';

import image from '../../lukas-blazek-mcSDtbWXUZU-unsplash.jpg';
import styles from './Hero.module.css';

const Hero = () => {
  const { hero, 'hero-image': heroImage, 'hero-text': heroText } = styles;

  return (
    <div className={hero}>
      <div className={heroText}>
        <h1>Voyez tout ce qu'il se passe</h1>
        <p>
          Éliminez l'écart entre les données et l'action. Agissez avec
          certitude.
        </p>
      </div>
      <img src={image} alt="hero-image" className={heroImage}></img>
    </div>
  );
};

export default Hero;
