import React from 'react';
import { Button, Navbar, Nav } from 'react-bootstrap';
import { FaGithub, FaPlayCircle } from 'react-icons/fa';

export default () => (
  <Navbar
    variant='secondary'
    className='px-2'
  >
    <Navbar.Brand>GraphSolver</Navbar.Brand>
    <Navbar.Toggle aria-controls='basic-navbar-nav'/>
    <Navbar.Collapse id='basic-navbar-nav'>
      <Nav className="me-auto">
        <Nav.Link
          href="https://github.com/viatra/VIATRA-Generator#readme"
        >
          About
        </Nav.Link>
        <Nav.Link
          href="https://github.com/viatra/VIATRA-Generator/wiki"
        >
          Getting started
        </Nav.Link>
        <Nav.Link
          href="https://github.com/viatra/VIATRA-Generator"
        >
          <FaGithub/> Github
        </Nav.Link>
      </Nav>
      <Button
        variant='success'
      >
        <FaPlayCircle/> Generate
      </Button>
    </Navbar.Collapse>
  </Navbar>
);
