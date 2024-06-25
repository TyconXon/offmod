// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTiburceMDL extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer AntennaBone;
	private final ModelRenderer Antenna_r1;
	private final ModelRenderer Antenna_r2;
	private final ModelRenderer Tail;
	private final ModelRenderer TailPart_r1;
	private final ModelRenderer TailPart_r2;
	private final ModelRenderer TailPart_r3;
	private final ModelRenderer TailPart_r4;
	private final ModelRenderer Back;
	private final ModelRenderer Spike_r1;
	private final ModelRenderer Spike_r2;
	private final ModelRenderer Spike_r3;
	private final ModelRenderer Spike_r4;
	private final ModelRenderer Ribcage_r1;
	private final ModelRenderer FrontLegRight;
	private final ModelRenderer LegR_r1;
	private final ModelRenderer FrontLegLeft;
	private final ModelRenderer Leg_r1;
	private final ModelRenderer BackLegRight;
	private final ModelRenderer BackLegR_r1;
	private final ModelRenderer BackLegLeft;
	private final ModelRenderer BackLeg_r1;

	public ModelTiburceMDL() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 17.0F, -5.0F);
		Head.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		AntennaBone = new ModelRenderer(this);
		AntennaBone.setRotationPoint(0.0F, -2.7162F, 1.5378F);
		Head.addChild(AntennaBone);

		Antenna_r1 = new ModelRenderer(this);
		Antenna_r1.setRotationPoint(-3.0F, 7.7162F, -1.5378F);
		AntennaBone.addChild(Antenna_r1);
		setRotationAngle(Antenna_r1, -0.4363F, 0.0F, 0.4363F);
		Antenna_r1.setTextureOffset(0, 8).addBox(1.0F, -11.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Antenna_r2 = new ModelRenderer(this);
		Antenna_r2.setRotationPoint(3.0F, 7.7162F, -1.5378F);
		AntennaBone.addChild(Antenna_r2);
		setRotationAngle(Antenna_r2, -0.4363F, 0.0F, -0.4363F);
		Antenna_r2.setTextureOffset(4, 8).addBox(-2.0F, -11.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, 0.0F);

		TailPart_r1 = new ModelRenderer(this);
		TailPart_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(TailPart_r1);
		setRotationAngle(TailPart_r1, 3.1416F, 0.0F, 0.0F);
		TailPart_r1.setTextureOffset(26, 7).addBox(-1.0F, 12.0F, -8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		TailPart_r2 = new ModelRenderer(this);
		TailPart_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(TailPart_r2);
		setRotationAngle(TailPart_r2, 2.7489F, 0.0F, 0.0F);
		TailPart_r2.setTextureOffset(18, 7).addBox(-1.0F, 15.5F, -6.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		TailPart_r3 = new ModelRenderer(this);
		TailPart_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(TailPart_r3);
		setRotationAngle(TailPart_r3, 1.2654F, 0.0F, 0.0F);
		TailPart_r3.setTextureOffset(23, 21).addBox(-1.0F, 6.5F, 12.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		TailPart_r4 = new ModelRenderer(this);
		TailPart_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(TailPart_r4);
		setRotationAngle(TailPart_r4, 0.5672F, 0.0F, 0.0F);
		TailPart_r4.setTextureOffset(18, 0).addBox(-1.0F, -3.0F, 8.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		Back = new ModelRenderer(this);
		Back.setRotationPoint(0.0F, 24.0F, 0.0F);

		Spike_r1 = new ModelRenderer(this);
		Spike_r1.setRotationPoint(0.0F, 0.0F, -3.0F);
		Back.addChild(Spike_r1);
		setRotationAngle(Spike_r1, -0.2618F, 0.0F, 0.0F);
		Spike_r1.setTextureOffset(2, 30).addBox(-0.5F, -11.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Spike_r2 = new ModelRenderer(this);
		Spike_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
		Back.addChild(Spike_r2);
		setRotationAngle(Spike_r2, -0.2618F, 0.0F, 0.0F);
		Spike_r2.setTextureOffset(2, 30).addBox(-0.5F, -11.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Spike_r3 = new ModelRenderer(this);
		Spike_r3.setRotationPoint(0.0F, 0.0F, 1.0F);
		Back.addChild(Spike_r3);
		setRotationAngle(Spike_r3, -0.2618F, 0.0F, 0.0F);
		Spike_r3.setTextureOffset(2, 30).addBox(-0.5F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Spike_r4 = new ModelRenderer(this);
		Spike_r4.setRotationPoint(0.0F, 0.0F, 3.0F);
		Back.addChild(Spike_r4);
		setRotationAngle(Spike_r4, -0.2618F, 0.0F, 0.0F);
		Spike_r4.setTextureOffset(2, 30).addBox(-0.5F, -9.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Ribcage_r1 = new ModelRenderer(this);
		Ribcage_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Back.addChild(Ribcage_r1);
		setRotationAngle(Ribcage_r1, -0.0873F, 0.0F, 0.0F);
		Ribcage_r1.setTextureOffset(0, 16).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 3.0F, 10.0F, 0.0F, false);

		FrontLegRight = new ModelRenderer(this);
		FrontLegRight.setRotationPoint(2.0F, 18.0F, -1.5F);

		LegR_r1 = new ModelRenderer(this);
		LegR_r1.setRotationPoint(-2.0F, 6.0F, 1.5F);
		FrontLegRight.addChild(LegR_r1);
		setRotationAngle(LegR_r1, -0.0873F, 0.0F, 0.0F);
		LegR_r1.setTextureOffset(18, 16).addBox(1.0F, -6.0F, -3.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		FrontLegLeft = new ModelRenderer(this);
		FrontLegLeft.setRotationPoint(-2.0F, 18.0F, -1.5F);

		Leg_r1 = new ModelRenderer(this);
		Leg_r1.setRotationPoint(2.0F, 6.0F, 1.5F);
		FrontLegLeft.addChild(Leg_r1);
		setRotationAngle(Leg_r1, -0.0873F, 0.0F, 0.0F);
		Leg_r1.setTextureOffset(18, 16).addBox(-3.0F, -6.0F, -3.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		BackLegRight = new ModelRenderer(this);
		BackLegRight.setRotationPoint(2.0F, 17.0F, 5.5F);

		BackLegR_r1 = new ModelRenderer(this);
		BackLegR_r1.setRotationPoint(-2.0F, 7.0F, -5.5F);
		BackLegRight.addChild(BackLegR_r1);
		setRotationAngle(BackLegR_r1, 0.0873F, 0.0F, 0.0F);
		BackLegR_r1.setTextureOffset(0, 16).addBox(1.0F, -7.0F, 5.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		BackLegLeft = new ModelRenderer(this);
		BackLegLeft.setRotationPoint(-2.0F, 17.0F, 5.5F);

		BackLeg_r1 = new ModelRenderer(this);
		BackLeg_r1.setRotationPoint(2.0F, 7.0F, -5.5F);
		BackLegLeft.addChild(BackLeg_r1);
		setRotationAngle(BackLeg_r1, 0.0873F, 0.0F, 0.0F);
		BackLeg_r1.setTextureOffset(0, 16).addBox(-3.0F, -7.0F, 5.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Back.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLegRight.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		FrontLegLeft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLegRight.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BackLegLeft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.FrontLegRight.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.BackLegRight.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.BackLegLeft.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.FrontLegLeft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}