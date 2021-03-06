package com.craftmend.openaudiomc.generic.networking.payloads.client.card;

import com.craftmend.openaudiomc.generic.networking.abstracts.AbstractPacketPayload;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ClientCreateCardPayload extends AbstractPacketPayload {

    private String serializedCard;

}