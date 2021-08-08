package com.landoulsi.crud.service;

import com.landoulsi.crud.domain.Ticket;

public interface TicketService {

    void ajoutTicket(Ticket ticket);

    void supprimerTicket(Ticket ticket);

    void modifierTicket(Ticket ticket);

    Ticket getTicket(Long id);

}
