import React from 'react';

import styles from './Presentat.module.css';
import image from '../../ash-edmonds-Koxa-GX_5zs-unsplash.jpg';

const Presentat = () => {
  const { presentat, imgContent, 'image-html': imageHtml } = styles;

  return (
    <div className={`${presentat} container`}>
      <p>
        Personnalisez votre dashboard pour suivre tout ce qui vous intéresse sur
        internet.
      </p>

      <div className={imgContent}>
        <img src={image} alt="img" className={imageHtml}></img>
      </div>
    </div>
  );
};

export default Presentat;
