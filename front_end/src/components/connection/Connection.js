import React from 'react';

import styles from './Connection.module.css';
import PrimaryButton from '../UI/PrimaryButton/PrimaryButton';

const Connection = (props) => {
  const {
    'connection-modal': connectionModal,
    'modal-form': modalForm,
    'form-title': formTitle,
    'form-item': formItem,
    'form-label': formLabel,
    'form-input': formInput,
    'submit-btn': submitBtn,
    hidden,
  } = styles;

  const closeConnectionModal = (e) => {
    if (!(e.target.className.split(' ')[0] === connectionModal)) return;
    props.onHideConnectionModal(true);
  };

  return (
    <div
      className={`${connectionModal} ${
        props.hideConnectionModalValue ? hidden : ''
      }`}
      onClick={closeConnectionModal}
    >
      <form className={modalForm}>
        <h2 className={formTitle}>Connection</h2>

        <div className={formItem}>
          <label className={formLabel}>email</label>
          <input className={formInput} type="email" />
        </div>

        <div className={formItem}>
          <label className={formLabel}>password</label>
          <input className={formInput} type="password" />
        </div>

        <PrimaryButton type="submit" className={submitBtn}>
          Valider
        </PrimaryButton>
      </form>
    </div>
  );
};

export default Connection;
