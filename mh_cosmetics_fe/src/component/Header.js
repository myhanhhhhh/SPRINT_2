import React from "react";

function Header(){
    return(
        <>
            <div>
                <nav className="navbar navbar-expand-lg bg-body-tertiary">
                    <div className="container-fluid" style="background-color: black; height: 70px">
                        <a className="navbar-brand" href="Header#" style="color: white; margin-left: 200px">MH</a>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbarSupportedContent"
                                aria-controls="navbarSupportedContent" aria-expanded="false"
                                aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                                <li className="nav-item">
                                    <a className="nav-link active" aria-current="page"
                                       style="color: white;margin-left: 100px" href="Header#"><b>GIỚI
                                        THIỆU</b></a>
                                </li>
                                <li className="nav-item dropdown">
                                    <a className="nav-link dropdown-toggle" href="Header#" role="button"
                                       data-bs-toggle="dropdown"
                                       aria-expanded="false" style="color: white;margin-left: 80px">
                                        <b>SẢN PHẨM</b>
                                    </a>
                                    <ul className="dropdown-menu">
                                        <li><a className="dropdown-item" href="Header#">Action</a></li>
                                        <li><a className="dropdown-item" href="Header#">Another action</a></li>
                                        <li>
                                            <hr className="dropdown-divider">
                                        </li>
                                        <li><a className="dropdown-item" href="Header#">Something else here</a></li>
                                    </ul>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link disabled" aria-disabled="true"
                                       style="color: white;margin-left: 80px"><b>LIÊN
                                        HỆ</b></a>
                                </li>
                            </ul>
                            <form className="d-flex" role="search" style="margin-right: 200px">
                                <input className="form-control me-2" type="search" placeholder="Search"
                                       aria-label="Search">
                                    <button className="btn btn-outline-success custom-btn" type="submit">Search</button>
                            </form>
                            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                                <li className="nav-item">
                                    <a className="nav-link active" aria-current="page"
                                       style="color: white;margin-right: 50px; font-size: 35px" href="Header#">
                                        <ion-icon name="cart-outline"></ion-icon>
                                    </a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link active" aria-current="page"
                                       style="color: white;margin-right: 50px; font-size: 35px" href="Header#">
                                        <ion-icon name="person-circle-outline"></ion-icon>
                                    </a>
                                </li>
                            </ul>

                        </div>
                    </div>
                </nav>
        </>
    )
}
export default Header