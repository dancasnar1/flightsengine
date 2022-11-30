import React from 'react'
import './Body.css'
import { Routes, Route } from 'react-router-dom'
import Home from '../../pages/Home/Home'
import NotFound from '../../pages/NotFound/NotFound'

function Body() {
  return (
    <div className='MainContainerBody'>
        <Routes>
          <Route path="/" element={<Home/>} exact></Route>
          {/* <Route path="/listTeam/1" element={<ListTeam01/>} exact></Route> */}
          <Route path="*" element={<NotFound/>} exact></Route>
          <Route path="/listTeam/:id" element={<ListTeam/>} exact></Route>
        </Routes>
      </div>
  )
}

export default Body