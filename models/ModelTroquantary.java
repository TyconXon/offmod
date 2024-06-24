// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTroquantary extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;

	public ModelTroquantary() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.0F, 19.0F);
		setRotationAngle(bone, 0.0F, 1.5708F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.3526F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, -9.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.3526F);
		cube_r2.setTextureOffset(6, 5).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(8.0F, -19.0F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.9599F);
		cube_r3.setTextureOffset(0, 33).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(11.0F, -26.0F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2182F);
		cube_r4.setTextureOffset(36, 33).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(21.0F, -29.0F, 0.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1745F);
		cube_r5.setTextureOffset(42, 0).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.0F, -22.0F, 1.0F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.3526F);
		cube_r6.setTextureOffset(48, 23).addBox(-2.0F, -41.0F, -6.0F, 8.0F, 27.0F, 10.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(31.0F, 6.0F, 5.0F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0426F, 0.0094F, -0.2616F);
		cube_r7.setTextureOffset(56, 0).addBox(-2.0F, -33.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(31.0F, 6.0F, -9.0F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1705F, -0.0376F, -0.215F);
		cube_r8.setTextureOffset(0, 61).addBox(-2.0F, -33.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 5.0F, 0.0F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.48F);
		cube_r9.setTextureOffset(0, 33).addBox(-6.0F, -31.0F, -6.0F, 12.0F, 16.0F, 12.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-6.0F, 8.0F, 0.0F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.4835F);
		cube_r10.setTextureOffset(36, 60).addBox(-4.0F, -15.0F, -6.0F, 8.0F, 17.0F, 12.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(6.0F, 4.0F, 0.0F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.2182F);
		cube_r11.setTextureOffset(0, 0).addBox(-7.0F, -16.0F, -7.0F, 14.0F, 19.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}