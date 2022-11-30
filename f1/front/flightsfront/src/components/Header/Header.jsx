import React from 'react'
import './Header.css'
//import homeButton from '../../assets/images/buttonHome.png'
import { Link } from 'react-router-dom'
function Header() {
  return (
    <div className='Head'>
        <h1 className='h1'>Flights Engine</h1>
        <Link to="/"><img src={homeButton} alt="img" srcSet="" /></Link>
      </div>
  )
}

export default Header