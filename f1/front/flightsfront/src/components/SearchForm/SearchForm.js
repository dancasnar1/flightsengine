import React, { Component, useState } from 'react';
import flightRoutes from '../Data/flightRoutes';

function SearchForm() {
  const [fromOrigins, setFromOrigins] = useState("");
  const [fromAvailableDestinations, setFromAvailableDestinations] = useState([]);

  const handleFromOrigins = (e) => {
    const flightRoute = flightRoutes.find(
      (flightRoute) => flightRoute.origin === e.target.value
    );
    setFromOrigins(flightRoute.origin);
    setFromAvailableDestinations(flightRoute.availableDestinations);
  };

  return (
    <form>
      <label>Select Origin: </label>
      <select onChange={(e) => handleFromOrigins(e)} >
        <option value=""> Select Origin </option>
        {flightRoutes.map((flightRoute, key) => (
          <option key={key} title={flightRoute.origin} value={flightRoute.origin}>
            {flightRoute.origin}
          </option>
        ))}
      </select>
      <label>Select Destination: </label>
      <select>
        <option value=""> Select Destination </option>
        {fromAvailableDestinations.map((destination, key) => (
          <option key={key} title="" value={destination}>{destination}</option>
        ))}
      </select>
    </form>
  );
}

export default SearchForm;
