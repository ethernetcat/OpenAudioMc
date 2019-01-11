package com.craftmend.openaudiomc.services.networking.payloads;

import com.craftmend.openaudiomc.modules.hue.objects.HueColor;
import com.craftmend.openaudiomc.services.networking.abstracts.AbstractPacketPayload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HueColorPayload extends AbstractPacketPayload {

    private String lights;
    private HueColor hueColor;

}