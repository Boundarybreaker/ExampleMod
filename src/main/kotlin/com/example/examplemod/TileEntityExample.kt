package com.example.examplemod

import net.minecraft.tileentity.TileEntity
import net.minecraft.tileentity.TileEntityType

class TileEntityExample constructor(type: TileEntityType<*> = ExampleMod.EXAMPLE_TE) : TileEntity(type)
