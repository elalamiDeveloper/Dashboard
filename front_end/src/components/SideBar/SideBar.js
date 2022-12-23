import React from 'react';

import image from '../../profil_img.jpg';
import styles from './SideBar.module.css';

import HomeOutlinedIcon from '@mui/icons-material/HomeOutlined';
import AddBoxOutlinedIcon from '@mui/icons-material/AddBoxOutlined';
import EditOutlinedIcon from '@mui/icons-material/EditOutlined';
import DriveFileMoveOutlinedIcon from '@mui/icons-material/DriveFileMoveOutlined';
import DeleteForeverOutlinedIcon from '@mui/icons-material/DeleteForeverOutlined';

const SideBar = () => {
  const {
    'side-bar': sideBarStyle,
    'profil-image': profilImage,
    item,
    title,
    icon,
    welcome,
    'list-widgets': listWidgets,
  } = styles;

  return (
    <div className={sideBarStyle}>
      <div className={profilImage}>
        <img src={image} alt="profil_image"></img>
      </div>

      <h2 className={welcome}>Welcome EL Alami</h2>

      <h3 className={`${item} ${title}`}>
        <HomeOutlinedIcon className={icon} /> <p>Dashbord</p>
      </h3>
      <h3>Widgets</h3>
      <ul className={listWidgets}>
        <li className={item}>
          <AddBoxOutlinedIcon /> <p>Add a new Widget</p>
        </li>

        <li className={item}>
          <EditOutlinedIcon /> <p>Reconfigure a Widget instance </p>
        </li>

        <li className={item}>
          <DriveFileMoveOutlinedIcon /> <p>Move a Widget instance</p>
        </li>

        <li className={item}>
          <DeleteForeverOutlinedIcon /> <p>Delete a Widget instance</p>
        </li>
      </ul>
    </div>
  );
};

export default SideBar;
